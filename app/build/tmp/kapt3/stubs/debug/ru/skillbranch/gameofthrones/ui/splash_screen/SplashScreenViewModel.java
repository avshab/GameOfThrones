package ru.skillbranch.gameofthrones.ui.splash_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/gameofthrones/ui/splash_screen/SplashScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dataCounter", "Landroidx/lifecycle/MutableLiveData;", "", "repository", "Lru/skillbranch/gameofthrones/repositories/RootRepository;", "showError", "", "timeCounter", "doneNavigating", "", "navigateNext", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class SplashScreenViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> dataCounter;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> timeCounter;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final ru.skillbranch.gameofthrones.repositories.RootRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showError;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> navigateNext() {
        return null;
    }
    
    public final void doneNavigating() {
    }
    
    public SplashScreenViewModel() {
        super();
    }
}