package com.example.animalkingdom.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.animalkingdom.data.model.Animal.class, com.example.animalkingdom.data.model.Species.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/animalkingdom/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getAnimalDao", "Lcom/example/animalkingdom/data/dao/AnimalDao;", "getSpecieDao", "Lcom/example/animalkingdom/data/dao/SpecieDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.animalkingdom.data.database.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.animalkingdom.data.database.AppDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.animalkingdom.data.dao.AnimalDao getAnimalDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.animalkingdom.data.dao.SpecieDao getSpecieDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/animalkingdom/data/database/AppDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/example/animalkingdom/data/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.animalkingdom.data.database.AppDatabase invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.example.animalkingdom.data.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}