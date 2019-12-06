// Generated by data binding compiler. Do not edit!
package ru.skillbranch.gameofthrones.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import ru.skillbranch.gameofthrones.R;
import ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel;

public abstract class CharacterScreenBinding extends ViewDataBinding {
  @NonNull
  public final ItemStaticInfoBlockBinding characterAliases;

  @NonNull
  public final ItemStaticInfoBlockBinding characterBorn;

  @NonNull
  public final ImageView characterHouseIcon;

  @NonNull
  public final LinearLayout characterInfoLayout;

  @NonNull
  public final TextView characterNameTextView;

  @NonNull
  public final ItemStaticInfoBlockBinding characterTitles;

  @NonNull
  public final ItemStaticInfoBlockBinding characterWords;

  @NonNull
  public final Button fatherActionButton;

  @NonNull
  public final TextView fatherTitleTextView;

  @NonNull
  public final Button motherActionButton;

  @NonNull
  public final TextView motherTitleTextView;

  @NonNull
  public final MotionLayout motionLayout;

  @Bindable
  protected CharacterScreenViewModel mCharacterViewModel;

  protected CharacterScreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ItemStaticInfoBlockBinding characterAliases, ItemStaticInfoBlockBinding characterBorn,
      ImageView characterHouseIcon, LinearLayout characterInfoLayout,
      TextView characterNameTextView, ItemStaticInfoBlockBinding characterTitles,
      ItemStaticInfoBlockBinding characterWords, Button fatherActionButton,
      TextView fatherTitleTextView, Button motherActionButton, TextView motherTitleTextView,
      MotionLayout motionLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.characterAliases = characterAliases;
    setContainedBinding(this.characterAliases);
    this.characterBorn = characterBorn;
    setContainedBinding(this.characterBorn);
    this.characterHouseIcon = characterHouseIcon;
    this.characterInfoLayout = characterInfoLayout;
    this.characterNameTextView = characterNameTextView;
    this.characterTitles = characterTitles;
    setContainedBinding(this.characterTitles);
    this.characterWords = characterWords;
    setContainedBinding(this.characterWords);
    this.fatherActionButton = fatherActionButton;
    this.fatherTitleTextView = fatherTitleTextView;
    this.motherActionButton = motherActionButton;
    this.motherTitleTextView = motherTitleTextView;
    this.motionLayout = motionLayout;
  }

  public abstract void setCharacterViewModel(@Nullable CharacterScreenViewModel characterViewModel);

  @Nullable
  public CharacterScreenViewModel getCharacterViewModel() {
    return mCharacterViewModel;
  }

  @NonNull
  public static CharacterScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.character_screen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CharacterScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CharacterScreenBinding>inflateInternal(inflater, R.layout.character_screen, root, attachToRoot, component);
  }

  @NonNull
  public static CharacterScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.character_screen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CharacterScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CharacterScreenBinding>inflateInternal(inflater, R.layout.character_screen, null, false, component);
  }

  public static CharacterScreenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CharacterScreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (CharacterScreenBinding)bind(component, view, R.layout.character_screen);
  }
}
