package ru.skillbranch.gameofthrones;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.skillbranch.gameofthrones.databinding.CharacterScreenBindingImpl;
import ru.skillbranch.gameofthrones.databinding.ChartersListFragmentBindingImpl;
import ru.skillbranch.gameofthrones.databinding.ItemActionInfoBlockBindingImpl;
import ru.skillbranch.gameofthrones.databinding.ItemCharacterBindingImpl;
import ru.skillbranch.gameofthrones.databinding.ItemStaticInfoBlockBindingImpl;
import ru.skillbranch.gameofthrones.databinding.ItemViewPageBindingImpl;
import ru.skillbranch.gameofthrones.databinding.MainActivityBindingImpl;
import ru.skillbranch.gameofthrones.databinding.SplashScreenFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CHARACTERSCREEN = 1;

  private static final int LAYOUT_CHARTERSLISTFRAGMENT = 2;

  private static final int LAYOUT_ITEMACTIONINFOBLOCK = 3;

  private static final int LAYOUT_ITEMCHARACTER = 4;

  private static final int LAYOUT_ITEMSTATICINFOBLOCK = 5;

  private static final int LAYOUT_ITEMVIEWPAGE = 6;

  private static final int LAYOUT_MAINACTIVITY = 7;

  private static final int LAYOUT_SPLASHSCREENFRAGMENT = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.character_screen, LAYOUT_CHARACTERSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.charters_list_fragment, LAYOUT_CHARTERSLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.item_action_info_block, LAYOUT_ITEMACTIONINFOBLOCK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.item_character, LAYOUT_ITEMCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.item_static_info_block, LAYOUT_ITEMSTATICINFOBLOCK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.item_view_page, LAYOUT_ITEMVIEWPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.main_activity, LAYOUT_MAINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ru.skillbranch.gameofthrones.R.layout.splash_screen_fragment, LAYOUT_SPLASHSCREENFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CHARACTERSCREEN: {
          if ("layout/character_screen_0".equals(tag)) {
            return new CharacterScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for character_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_CHARTERSLISTFRAGMENT: {
          if ("layout/charters_list_fragment_0".equals(tag)) {
            return new ChartersListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for charters_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMACTIONINFOBLOCK: {
          if ("layout/item_action_info_block_0".equals(tag)) {
            return new ItemActionInfoBlockBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_action_info_block is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHARACTER: {
          if ("layout/item_character_0".equals(tag)) {
            return new ItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATICINFOBLOCK: {
          if ("layout/item_static_info_block_0".equals(tag)) {
            return new ItemStaticInfoBlockBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_static_info_block is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIEWPAGE: {
          if ("layout/item_view_page_0".equals(tag)) {
            return new ItemViewPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_view_page is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITY: {
          if ("layout/main_activity_0".equals(tag)) {
            return new MainActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SPLASHSCREENFRAGMENT: {
          if ("layout/splash_screen_fragment_0".equals(tag)) {
            return new SplashScreenFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for splash_screen_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "list_item_character_info");
      sKeys.put(2, "characterViewModel");
      sKeys.put(3, "list_item_character_name");
      sKeys.put(4, "actionTitle");
      sKeys.put(5, "itemTitle");
      sKeys.put(6, "charactersListViewModel");
      sKeys.put(7, "itemInfo");
      sKeys.put(8, "splashViewModel");
      sKeys.put(9, "itemTitleAction");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/character_screen_0", ru.skillbranch.gameofthrones.R.layout.character_screen);
      sKeys.put("layout/charters_list_fragment_0", ru.skillbranch.gameofthrones.R.layout.charters_list_fragment);
      sKeys.put("layout/item_action_info_block_0", ru.skillbranch.gameofthrones.R.layout.item_action_info_block);
      sKeys.put("layout/item_character_0", ru.skillbranch.gameofthrones.R.layout.item_character);
      sKeys.put("layout/item_static_info_block_0", ru.skillbranch.gameofthrones.R.layout.item_static_info_block);
      sKeys.put("layout/item_view_page_0", ru.skillbranch.gameofthrones.R.layout.item_view_page);
      sKeys.put("layout/main_activity_0", ru.skillbranch.gameofthrones.R.layout.main_activity);
      sKeys.put("layout/splash_screen_fragment_0", ru.skillbranch.gameofthrones.R.layout.splash_screen_fragment);
    }
  }
}
