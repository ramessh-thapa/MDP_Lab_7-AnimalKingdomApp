package com.example.animalkingdom.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.animalkingdom.data.dao.AnimalDao;
import com.example.animalkingdom.data.dao.AnimalDao_Impl;
import com.example.animalkingdom.data.dao.SpecieDao;
import com.example.animalkingdom.data.dao.SpecieDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AnimalDao _animalDao;

  private volatile SpecieDao _specieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `animals` (`name` TEXT NOT NULL, `habitat` TEXT NOT NULL, `diet` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `species` (`name` TEXT NOT NULL, `description` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fcf77bf0e5a69b87b3c5e1afc8e9d9b4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `animals`");
        _db.execSQL("DROP TABLE IF EXISTS `species`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAnimals = new HashMap<String, TableInfo.Column>(4);
        _columnsAnimals.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("habitat", new TableInfo.Column("habitat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("diet", new TableInfo.Column("diet", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAnimals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAnimals = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAnimals = new TableInfo("animals", _columnsAnimals, _foreignKeysAnimals, _indicesAnimals);
        final TableInfo _existingAnimals = TableInfo.read(_db, "animals");
        if (! _infoAnimals.equals(_existingAnimals)) {
          return new RoomOpenHelper.ValidationResult(false, "animals(com.example.animalkingdom.data.model.Animal).\n"
                  + " Expected:\n" + _infoAnimals + "\n"
                  + " Found:\n" + _existingAnimals);
        }
        final HashMap<String, TableInfo.Column> _columnsSpecies = new HashMap<String, TableInfo.Column>(3);
        _columnsSpecies.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpecies.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpecies.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSpecies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSpecies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSpecies = new TableInfo("species", _columnsSpecies, _foreignKeysSpecies, _indicesSpecies);
        final TableInfo _existingSpecies = TableInfo.read(_db, "species");
        if (! _infoSpecies.equals(_existingSpecies)) {
          return new RoomOpenHelper.ValidationResult(false, "species(com.example.animalkingdom.data.model.Species).\n"
                  + " Expected:\n" + _infoSpecies + "\n"
                  + " Found:\n" + _existingSpecies);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "fcf77bf0e5a69b87b3c5e1afc8e9d9b4", "cc652fa082f90781c9591378697ec371");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "animals","species");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `animals`");
      _db.execSQL("DELETE FROM `species`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AnimalDao.class, AnimalDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SpecieDao.class, SpecieDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public AnimalDao getAnimalDao() {
    if (_animalDao != null) {
      return _animalDao;
    } else {
      synchronized(this) {
        if(_animalDao == null) {
          _animalDao = new AnimalDao_Impl(this);
        }
        return _animalDao;
      }
    }
  }

  @Override
  public SpecieDao getSpecieDao() {
    if (_specieDao != null) {
      return _specieDao;
    } else {
      synchronized(this) {
        if(_specieDao == null) {
          _specieDao = new SpecieDao_Impl(this);
        }
        return _specieDao;
      }
    }
  }
}
