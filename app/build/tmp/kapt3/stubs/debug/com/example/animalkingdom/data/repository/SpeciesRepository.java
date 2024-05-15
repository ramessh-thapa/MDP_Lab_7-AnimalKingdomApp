package com.example.animalkingdom.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/animalkingdom/data/repository/SpeciesRepository;", "", "specieDao", "Lcom/example/animalkingdom/data/dao/SpecieDao;", "(Lcom/example/animalkingdom/data/dao/SpecieDao;)V", "allSpecies", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/animalkingdom/data/model/Species;", "getAllSpecies", "()Landroidx/lifecycle/LiveData;", "insert", "", "species", "(Lcom/example/animalkingdom/data/model/Species;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SpeciesRepository {
    private final com.example.animalkingdom.data.dao.SpecieDao specieDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.animalkingdom.data.model.Species>> allSpecies = null;
    
    public SpeciesRepository(@org.jetbrains.annotations.NotNull
    com.example.animalkingdom.data.dao.SpecieDao specieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.animalkingdom.data.model.Species>> getAllSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.animalkingdom.data.model.Species species, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}