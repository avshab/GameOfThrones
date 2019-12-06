package ru.skillbranch.gameofthrones.databinding;
import ru.skillbranch.gameofthrones.R;
import ru.skillbranch.gameofthrones.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemActionInfoBlockBindingImpl extends ItemActionInfoBlockBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemActionInfoBlockBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemActionInfoBlockBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.infpItemStaticBlock.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleItemStaticBlock.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.actionTitle == variableId) {
            setActionTitle((java.lang.String) variable);
        }
        else if (BR.itemTitleAction == variableId) {
            setItemTitleAction((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActionTitle(@Nullable java.lang.String ActionTitle) {
        this.mActionTitle = ActionTitle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.actionTitle);
        super.requestRebind();
    }
    public void setItemTitleAction(@Nullable java.lang.String ItemTitleAction) {
        this.mItemTitleAction = ItemTitleAction;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.itemTitleAction);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String actionTitle = mActionTitle;
        java.lang.String itemTitleAction = mItemTitleAction;
        int actionTitleIsEmptyViewGONEViewVISIBLE = 0;
        boolean actionTitleIsEmpty = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (actionTitle != null) {
                    // read actionTitle.isEmpty()
                    actionTitleIsEmpty = actionTitle.isEmpty();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(actionTitleIsEmpty) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read actionTitle.isEmpty() ? View.GONE : View.VISIBLE
                actionTitleIsEmptyViewGONEViewVISIBLE = ((actionTitleIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.infpItemStaticBlock, actionTitle);
            this.infpItemStaticBlock.setVisibility(actionTitleIsEmptyViewGONEViewVISIBLE);
            this.titleItemStaticBlock.setVisibility(actionTitleIsEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleItemStaticBlock, itemTitleAction);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): actionTitle
        flag 1 (0x2L): itemTitleAction
        flag 2 (0x3L): null
        flag 3 (0x4L): actionTitle.isEmpty() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): actionTitle.isEmpty() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}