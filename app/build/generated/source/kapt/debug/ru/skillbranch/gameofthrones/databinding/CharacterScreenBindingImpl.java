package ru.skillbranch.gameofthrones.databinding;
import ru.skillbranch.gameofthrones.R;
import ru.skillbranch.gameofthrones.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CharacterScreenBindingImpl extends CharacterScreenBinding implements ru.skillbranch.gameofthrones.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(2, 
            new String[] {"item_static_info_block", "item_static_info_block", "item_static_info_block", "item_static_info_block"},
            new int[] {7, 8, 9, 10},
            new int[] {ru.skillbranch.gameofthrones.R.layout.item_static_info_block,
                ru.skillbranch.gameofthrones.R.layout.item_static_info_block,
                ru.skillbranch.gameofthrones.R.layout.item_static_info_block,
                ru.skillbranch.gameofthrones.R.layout.item_static_info_block});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.character_house_icon, 11);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CharacterScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private CharacterScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) bindings[10]
            , (ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) bindings[9]
            , (ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) bindings[7]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            );
        this.characterInfoLayout.setTag(null);
        this.characterNameTextView.setTag(null);
        this.fatherActionButton.setTag(null);
        this.fatherTitleTextView.setTag(null);
        this.motherActionButton.setTag(null);
        this.motherTitleTextView.setTag(null);
        this.motionLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new ru.skillbranch.gameofthrones.generated.callback.OnClickListener(this, 2);
        mCallback1 = new ru.skillbranch.gameofthrones.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        characterWords.invalidateAll();
        characterBorn.invalidateAll();
        characterTitles.invalidateAll();
        characterAliases.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (characterWords.hasPendingBindings()) {
            return true;
        }
        if (characterBorn.hasPendingBindings()) {
            return true;
        }
        if (characterTitles.hasPendingBindings()) {
            return true;
        }
        if (characterAliases.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.characterViewModel == variableId) {
            setCharacterViewModel((ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterViewModel(@Nullable ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel CharacterViewModel) {
        this.mCharacterViewModel = CharacterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.characterViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        characterWords.setLifecycleOwner(lifecycleOwner);
        characterBorn.setLifecycleOwner(lifecycleOwner);
        characterTitles.setLifecycleOwner(lifecycleOwner);
        characterAliases.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCharacterWords((ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) object, fieldId);
            case 1 :
                return onChangeCharacterViewModelTitles((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeCharacterBorn((ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) object, fieldId);
            case 3 :
                return onChangeCharacterViewModelCharacterFull((androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull>) object, fieldId);
            case 4 :
                return onChangeCharacterAliases((ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) object, fieldId);
            case 5 :
                return onChangeCharacterViewModelAliases((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeCharacterTitles((ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCharacterWords(ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding CharacterWords, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterViewModelTitles(androidx.lifecycle.LiveData<java.lang.String> CharacterViewModelTitles, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterBorn(ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding CharacterBorn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterViewModelCharacterFull(androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> CharacterViewModelCharacterFull, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterAliases(ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding CharacterAliases, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterViewModelAliases(androidx.lifecycle.LiveData<java.lang.String> CharacterViewModelAliases, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterTitles(ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBinding CharacterTitles, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> characterViewModelTitles = null;
        ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel characterViewModel = mCharacterViewModel;
        java.lang.String characterViewModelTitlesGetValue = null;
        ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter characterViewModelCharacterFullFather = null;
        java.lang.String characterViewModelCharacterFullMotherName = null;
        int characterViewModelCharacterFullMotherJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String characterViewModelAliasesGetValue = null;
        java.lang.String characterViewModelCharacterFullWords = null;
        java.lang.String characterViewModelCharacterFullBorn = null;
        androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> characterViewModelCharacterFull = null;
        java.lang.String characterViewModelCharacterFullFatherName = null;
        int characterViewModelCharacterFullFatherJavaLangObjectNullViewGONEViewVISIBLE = 0;
        ru.skillbranch.gameofthrones.data.local.entities.CharacterFull characterViewModelCharacterFullGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> characterViewModelAliases = null;
        ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter characterViewModelCharacterFullMother = null;
        boolean characterViewModelCharacterFullMotherJavaLangObjectNull = false;
        boolean characterViewModelCharacterFullFatherJavaLangObjectNull = false;
        java.lang.String characterViewModelCharacterFullName = null;

        if ((dirtyFlags & 0x1aaL) != 0) {


            if ((dirtyFlags & 0x182L) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.titles
                        characterViewModelTitles = characterViewModel.getTitles();
                    }
                    updateLiveDataRegistration(1, characterViewModelTitles);


                    if (characterViewModelTitles != null) {
                        // read characterViewModel.titles.getValue()
                        characterViewModelTitlesGetValue = characterViewModelTitles.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.characterFull
                        characterViewModelCharacterFull = characterViewModel.getCharacterFull();
                    }
                    updateLiveDataRegistration(3, characterViewModelCharacterFull);


                    if (characterViewModelCharacterFull != null) {
                        // read characterViewModel.characterFull.getValue()
                        characterViewModelCharacterFullGetValue = characterViewModelCharacterFull.getValue();
                    }


                    if (characterViewModelCharacterFullGetValue != null) {
                        // read characterViewModel.characterFull.getValue().father
                        characterViewModelCharacterFullFather = characterViewModelCharacterFullGetValue.getFather();
                        // read characterViewModel.characterFull.getValue().words
                        characterViewModelCharacterFullWords = characterViewModelCharacterFullGetValue.getWords();
                        // read characterViewModel.characterFull.getValue().born
                        characterViewModelCharacterFullBorn = characterViewModelCharacterFullGetValue.getBorn();
                        // read characterViewModel.characterFull.getValue().mother
                        characterViewModelCharacterFullMother = characterViewModelCharacterFullGetValue.getMother();
                        // read characterViewModel.characterFull.getValue().name
                        characterViewModelCharacterFullName = characterViewModelCharacterFullGetValue.getName();
                    }


                    if (characterViewModelCharacterFullFather != null) {
                        // read characterViewModel.characterFull.getValue().father.name
                        characterViewModelCharacterFullFatherName = characterViewModelCharacterFullFather.getName();
                    }
                    // read characterViewModel.characterFull.getValue().father == null
                    characterViewModelCharacterFullFatherJavaLangObjectNull = (characterViewModelCharacterFullFather) == (null);
                    // read characterViewModel.characterFull.getValue().mother == null
                    characterViewModelCharacterFullMotherJavaLangObjectNull = (characterViewModelCharacterFullMother) == (null);
                if((dirtyFlags & 0x188L) != 0) {
                    if(characterViewModelCharacterFullFatherJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x188L) != 0) {
                    if(characterViewModelCharacterFullMotherJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                    if (characterViewModelCharacterFullMother != null) {
                        // read characterViewModel.characterFull.getValue().mother.name
                        characterViewModelCharacterFullMotherName = characterViewModelCharacterFullMother.getName();
                    }


                    // read characterViewModel.characterFull.getValue().father == null ? View.GONE : View.VISIBLE
                    characterViewModelCharacterFullFatherJavaLangObjectNullViewGONEViewVISIBLE = ((characterViewModelCharacterFullFatherJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read characterViewModel.characterFull.getValue().mother == null ? View.GONE : View.VISIBLE
                    characterViewModelCharacterFullMotherJavaLangObjectNullViewGONEViewVISIBLE = ((characterViewModelCharacterFullMotherJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.aliases
                        characterViewModelAliases = characterViewModel.getAliases();
                    }
                    updateLiveDataRegistration(5, characterViewModelAliases);


                    if (characterViewModelAliases != null) {
                        // read characterViewModel.aliases.getValue()
                        characterViewModelAliasesGetValue = characterViewModelAliases.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.characterAliases.setItemInfo(characterViewModelAliasesGetValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.characterAliases.setItemTitle(getRoot().getResources().getString(R.string.character_aliases_item_name));
            this.characterBorn.setItemTitle(getRoot().getResources().getString(R.string.character_born_item_name));
            this.characterTitles.setItemTitle(getRoot().getResources().getString(R.string.character_titles_item_name));
            this.characterWords.setItemTitle(getRoot().getResources().getString(R.string.character_words_item_name));
            this.fatherActionButton.setOnClickListener(mCallback1);
            this.motherActionButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            this.characterBorn.setItemInfo(characterViewModelCharacterFullBorn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.characterNameTextView, characterViewModelCharacterFullName);
            this.characterWords.setItemInfo(characterViewModelCharacterFullWords);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fatherActionButton, characterViewModelCharacterFullFatherName);
            this.fatherActionButton.setVisibility(characterViewModelCharacterFullFatherJavaLangObjectNullViewGONEViewVISIBLE);
            this.fatherTitleTextView.setVisibility(characterViewModelCharacterFullFatherJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.motherActionButton, characterViewModelCharacterFullMotherName);
            this.motherActionButton.setVisibility(characterViewModelCharacterFullMotherJavaLangObjectNullViewGONEViewVISIBLE);
            this.motherTitleTextView.setVisibility(characterViewModelCharacterFullMotherJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.characterTitles.setItemInfo(characterViewModelTitlesGetValue);
        }
        executeBindingsOn(characterWords);
        executeBindingsOn(characterBorn);
        executeBindingsOn(characterTitles);
        executeBindingsOn(characterAliases);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // characterViewModel.characterFull.getValue() != null
                boolean characterViewModelCharacterFullGetValueJavaLangObjectNull = false;
                // characterViewModel.characterFull.getValue()
                ru.skillbranch.gameofthrones.data.local.entities.CharacterFull characterViewModelCharacterFullGetValue = null;
                // characterViewModel.characterFull != null
                boolean characterViewModelCharacterFullJavaLangObjectNull = false;
                // characterViewModel
                ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel characterViewModel = mCharacterViewModel;
                // characterViewModel.characterFull.getValue().mother
                ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter characterViewModelCharacterFullMother = null;
                // characterViewModel.characterFull
                androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> characterViewModelCharacterFull = null;
                // characterViewModel != null
                boolean characterViewModelJavaLangObjectNull = false;



                characterViewModelJavaLangObjectNull = (characterViewModel) != (null);
                if (characterViewModelJavaLangObjectNull) {




                    characterViewModelCharacterFull = characterViewModel.getCharacterFull();

                    characterViewModelCharacterFullJavaLangObjectNull = (characterViewModelCharacterFull) != (null);
                    if (characterViewModelCharacterFullJavaLangObjectNull) {


                        characterViewModelCharacterFullGetValue = characterViewModelCharacterFull.getValue();

                        characterViewModelCharacterFullGetValueJavaLangObjectNull = (characterViewModelCharacterFullGetValue) != (null);
                        if (characterViewModelCharacterFullGetValueJavaLangObjectNull) {


                            characterViewModelCharacterFullMother = characterViewModelCharacterFullGetValue.getMother();

                            characterViewModel.navigateToRelative(characterViewModelCharacterFullMother);
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // characterViewModel.characterFull.getValue().father
                ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter characterViewModelCharacterFullFather = null;
                // characterViewModel.characterFull.getValue() != null
                boolean characterViewModelCharacterFullGetValueJavaLangObjectNull = false;
                // characterViewModel.characterFull.getValue()
                ru.skillbranch.gameofthrones.data.local.entities.CharacterFull characterViewModelCharacterFullGetValue = null;
                // characterViewModel.characterFull != null
                boolean characterViewModelCharacterFullJavaLangObjectNull = false;
                // characterViewModel
                ru.skillbranch.gameofthrones.ui.character_screen.CharacterScreenViewModel characterViewModel = mCharacterViewModel;
                // characterViewModel.characterFull
                androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> characterViewModelCharacterFull = null;
                // characterViewModel != null
                boolean characterViewModelJavaLangObjectNull = false;



                characterViewModelJavaLangObjectNull = (characterViewModel) != (null);
                if (characterViewModelJavaLangObjectNull) {




                    characterViewModelCharacterFull = characterViewModel.getCharacterFull();

                    characterViewModelCharacterFullJavaLangObjectNull = (characterViewModelCharacterFull) != (null);
                    if (characterViewModelCharacterFullJavaLangObjectNull) {


                        characterViewModelCharacterFullGetValue = characterViewModelCharacterFull.getValue();

                        characterViewModelCharacterFullGetValueJavaLangObjectNull = (characterViewModelCharacterFullGetValue) != (null);
                        if (characterViewModelCharacterFullGetValueJavaLangObjectNull) {


                            characterViewModelCharacterFullFather = characterViewModelCharacterFullGetValue.getFather();

                            characterViewModel.navigateToRelative(characterViewModelCharacterFullFather);
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): characterWords
        flag 1 (0x2L): characterViewModel.titles
        flag 2 (0x3L): characterBorn
        flag 3 (0x4L): characterViewModel.characterFull
        flag 4 (0x5L): characterAliases
        flag 5 (0x6L): characterViewModel.aliases
        flag 6 (0x7L): characterTitles
        flag 7 (0x8L): characterViewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): characterViewModel.characterFull.getValue().mother == null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): characterViewModel.characterFull.getValue().mother == null ? View.GONE : View.VISIBLE
        flag 11 (0xcL): characterViewModel.characterFull.getValue().father == null ? View.GONE : View.VISIBLE
        flag 12 (0xdL): characterViewModel.characterFull.getValue().father == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}