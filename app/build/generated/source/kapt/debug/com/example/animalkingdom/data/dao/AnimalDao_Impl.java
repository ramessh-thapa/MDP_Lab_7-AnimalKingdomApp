package com.example.animalkingdom.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.animalkingdom.data.model.Animal;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AnimalDao_Impl implements AnimalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Animal> __insertionAdapterOfAnimal;

  public AnimalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAnimal = new EntityInsertionAdapter<Animal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `animals` (`name`,`habitat`,`diet`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Animal value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getHabitat() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHabitat());
        }
        if (value.getDiet() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDiet());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object addAnimal(final Animal animal, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAnimal.insert(animal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public LiveData<List<Animal>> getAllAnimals() {
    final String _sql = "SELECT * FROM animals ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"animals"}, false, new Callable<List<Animal>>() {
      @Override
      public List<Animal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfHabitat = CursorUtil.getColumnIndexOrThrow(_cursor, "habitat");
          final int _cursorIndexOfDiet = CursorUtil.getColumnIndexOrThrow(_cursor, "diet");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<Animal> _result = new ArrayList<Animal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Animal _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpHabitat;
            if (_cursor.isNull(_cursorIndexOfHabitat)) {
              _tmpHabitat = null;
            } else {
              _tmpHabitat = _cursor.getString(_cursorIndexOfHabitat);
            }
            final String _tmpDiet;
            if (_cursor.isNull(_cursorIndexOfDiet)) {
              _tmpDiet = null;
            } else {
              _tmpDiet = _cursor.getString(_cursorIndexOfDiet);
            }
            _item = new Animal(_tmpName,_tmpHabitat,_tmpDiet);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
