package com.miu.mdp.animalkingdomexplorer.ui.animalsdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/miu/mdp/animalkingdomexplorer/ui/animalsdetails/AnimalListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/animalkingdom/data/model/Animal;", "Lcom/miu/mdp/animalkingdomexplorer/ui/animalsdetails/AnimalListAdapter$AnimalViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AnimalDiffCallback", "AnimalViewHolder", "app_debug"})
public final class AnimalListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.animalkingdom.data.model.Animal, com.miu.mdp.animalkingdomexplorer.ui.animalsdetails.AnimalListAdapter.AnimalViewHolder> {
    
    public AnimalListAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.miu.mdp.animalkingdomexplorer.ui.animalsdetails.AnimalListAdapter.AnimalViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.miu.mdp.animalkingdomexplorer.ui.animalsdetails.AnimalListAdapter.AnimalViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/miu/mdp/animalkingdomexplorer/ui/animalsdetails/AnimalListAdapter$AnimalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "animalDietTextView", "Landroid/widget/TextView;", "animalHabitatTextView", "animalNameTextView", "bind", "", "animal", "Lcom/example/animalkingdom/data/model/Animal;", "app_debug"})
    public static final class AnimalViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView animalNameTextView = null;
        private final android.widget.TextView animalHabitatTextView = null;
        private final android.widget.TextView animalDietTextView = null;
        
        public AnimalViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.animalkingdom.data.model.Animal animal) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/miu/mdp/animalkingdomexplorer/ui/animalsdetails/AnimalListAdapter$AnimalDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/animalkingdom/data/model/Animal;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class AnimalDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.animalkingdom.data.model.Animal> {
        
        public AnimalDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.animalkingdom.data.model.Animal oldItem, @org.jetbrains.annotations.NotNull
        com.example.animalkingdom.data.model.Animal newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.animalkingdom.data.model.Animal oldItem, @org.jetbrains.annotations.NotNull
        com.example.animalkingdom.data.model.Animal newItem) {
            return false;
        }
    }
}