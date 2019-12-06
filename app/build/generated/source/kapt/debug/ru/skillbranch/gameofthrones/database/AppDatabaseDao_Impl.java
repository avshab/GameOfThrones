package ru.skillbranch.gameofthrones.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import ru.skillbranch.gameofthrones.data.local.entities.Character;
import ru.skillbranch.gameofthrones.data.local.entities.House;
import ru.skillbranch.gameofthrones.data.local.entities.ListConverter;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabaseDao_Impl implements AppDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<House> __insertionAdapterOfHouse;

  private final ListConverter __listConverter = new ListConverter();

  private final EntityInsertionAdapter<Character> __insertionAdapterOfCharacter;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfClearCharacters;

  public AppDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHouse = new EntityInsertionAdapter<House>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `house_table` (`id`,`name`,`region`,`coatOfArms`,`words`,`seats`,`titles`,`currentLord`,`heir`,`overlord`,`founded`,`founder`,`diedOut`,`ancestralWeapons`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, House value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getRegion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRegion());
        }
        if (value.getCoatOfArms() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCoatOfArms());
        }
        if (value.getWords() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWords());
        }
        final String _tmp;
        _tmp = __listConverter.fromArrayList(value.getTitles());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __listConverter.fromArrayList(value.getSeats());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        if (value.getCurrentLord() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCurrentLord());
        }
        if (value.getHeir() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getHeir());
        }
        if (value.getOverlord() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getOverlord());
        }
        if (value.getFounded() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getFounded());
        }
        if (value.getFounder() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getFounder());
        }
        if (value.getDiedOut() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDiedOut());
        }
        final String _tmp_2;
        _tmp_2 = __listConverter.fromArrayList(value.getAncestralWeapons());
        if (_tmp_2 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, _tmp_2);
        }
      }
    };
    this.__insertionAdapterOfCharacter = new EntityInsertionAdapter<Character>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `character_table` (`id`,`name`,`gender`,`culture`,`born`,`died`,`titles`,`aliases`,`father`,`mother`,`spouse`,`houseId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Character value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGender() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGender());
        }
        if (value.getCulture() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCulture());
        }
        if (value.getBorn() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBorn());
        }
        if (value.getDied() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDied());
        }
        final String _tmp;
        _tmp = __listConverter.fromArrayList(value.getTitles());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __listConverter.fromArrayList(value.getAliases());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        if (value.getFather() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFather());
        }
        if (value.getMother() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getMother());
        }
        if (value.getSpouse() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSpouse());
        }
        if (value.getHouseId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getHouseId());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM house_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearCharacters = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM character_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final House data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHouse.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<House> data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHouse.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCharacter(final Character character) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCharacter.insert(character);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllCharacters(final List<Character> data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCharacter.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public void clearCharacters() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearCharacters.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearCharacters.release(_stmt);
    }
  }

  @Override
  public House get(final String key) {
    final String _sql = "SELECT * FROM house_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final int _cursorIndexOfCoatOfArms = CursorUtil.getColumnIndexOrThrow(_cursor, "coatOfArms");
      final int _cursorIndexOfWords = CursorUtil.getColumnIndexOrThrow(_cursor, "words");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "seats");
      final int _cursorIndexOfSeats = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfCurrentLord = CursorUtil.getColumnIndexOrThrow(_cursor, "currentLord");
      final int _cursorIndexOfHeir = CursorUtil.getColumnIndexOrThrow(_cursor, "heir");
      final int _cursorIndexOfOverlord = CursorUtil.getColumnIndexOrThrow(_cursor, "overlord");
      final int _cursorIndexOfFounded = CursorUtil.getColumnIndexOrThrow(_cursor, "founded");
      final int _cursorIndexOfFounder = CursorUtil.getColumnIndexOrThrow(_cursor, "founder");
      final int _cursorIndexOfDiedOut = CursorUtil.getColumnIndexOrThrow(_cursor, "diedOut");
      final int _cursorIndexOfAncestralWeapons = CursorUtil.getColumnIndexOrThrow(_cursor, "ancestralWeapons");
      final House _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        final String _tmpCoatOfArms;
        _tmpCoatOfArms = _cursor.getString(_cursorIndexOfCoatOfArms);
        final String _tmpWords;
        _tmpWords = _cursor.getString(_cursorIndexOfWords);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpSeats;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfSeats);
        _tmpSeats = __listConverter.fromString(_tmp_1);
        final String _tmpCurrentLord;
        _tmpCurrentLord = _cursor.getString(_cursorIndexOfCurrentLord);
        final String _tmpHeir;
        _tmpHeir = _cursor.getString(_cursorIndexOfHeir);
        final String _tmpOverlord;
        _tmpOverlord = _cursor.getString(_cursorIndexOfOverlord);
        final String _tmpFounded;
        _tmpFounded = _cursor.getString(_cursorIndexOfFounded);
        final String _tmpFounder;
        _tmpFounder = _cursor.getString(_cursorIndexOfFounder);
        final String _tmpDiedOut;
        _tmpDiedOut = _cursor.getString(_cursorIndexOfDiedOut);
        final List<String> _tmpAncestralWeapons;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfAncestralWeapons);
        _tmpAncestralWeapons = __listConverter.fromString(_tmp_2);
        _result = new House(_tmpId,_tmpName,_tmpRegion,_tmpCoatOfArms,_tmpWords,_tmpTitles,_tmpSeats,_tmpCurrentLord,_tmpHeir,_tmpOverlord,_tmpFounded,_tmpFounder,_tmpDiedOut,_tmpAncestralWeapons);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<House> getAll() {
    final String _sql = "SELECT * FROM house_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final int _cursorIndexOfCoatOfArms = CursorUtil.getColumnIndexOrThrow(_cursor, "coatOfArms");
      final int _cursorIndexOfWords = CursorUtil.getColumnIndexOrThrow(_cursor, "words");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "seats");
      final int _cursorIndexOfSeats = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfCurrentLord = CursorUtil.getColumnIndexOrThrow(_cursor, "currentLord");
      final int _cursorIndexOfHeir = CursorUtil.getColumnIndexOrThrow(_cursor, "heir");
      final int _cursorIndexOfOverlord = CursorUtil.getColumnIndexOrThrow(_cursor, "overlord");
      final int _cursorIndexOfFounded = CursorUtil.getColumnIndexOrThrow(_cursor, "founded");
      final int _cursorIndexOfFounder = CursorUtil.getColumnIndexOrThrow(_cursor, "founder");
      final int _cursorIndexOfDiedOut = CursorUtil.getColumnIndexOrThrow(_cursor, "diedOut");
      final int _cursorIndexOfAncestralWeapons = CursorUtil.getColumnIndexOrThrow(_cursor, "ancestralWeapons");
      final List<House> _result = new ArrayList<House>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final House _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        final String _tmpCoatOfArms;
        _tmpCoatOfArms = _cursor.getString(_cursorIndexOfCoatOfArms);
        final String _tmpWords;
        _tmpWords = _cursor.getString(_cursorIndexOfWords);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpSeats;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfSeats);
        _tmpSeats = __listConverter.fromString(_tmp_1);
        final String _tmpCurrentLord;
        _tmpCurrentLord = _cursor.getString(_cursorIndexOfCurrentLord);
        final String _tmpHeir;
        _tmpHeir = _cursor.getString(_cursorIndexOfHeir);
        final String _tmpOverlord;
        _tmpOverlord = _cursor.getString(_cursorIndexOfOverlord);
        final String _tmpFounded;
        _tmpFounded = _cursor.getString(_cursorIndexOfFounded);
        final String _tmpFounder;
        _tmpFounder = _cursor.getString(_cursorIndexOfFounder);
        final String _tmpDiedOut;
        _tmpDiedOut = _cursor.getString(_cursorIndexOfDiedOut);
        final List<String> _tmpAncestralWeapons;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfAncestralWeapons);
        _tmpAncestralWeapons = __listConverter.fromString(_tmp_2);
        _item = new House(_tmpId,_tmpName,_tmpRegion,_tmpCoatOfArms,_tmpWords,_tmpTitles,_tmpSeats,_tmpCurrentLord,_tmpHeir,_tmpOverlord,_tmpFounded,_tmpFounder,_tmpDiedOut,_tmpAncestralWeapons);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Character getCharacter(final String key) {
    final String _sql = "SELECT * FROM character_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfCulture = CursorUtil.getColumnIndexOrThrow(_cursor, "culture");
      final int _cursorIndexOfBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "born");
      final int _cursorIndexOfDied = CursorUtil.getColumnIndexOrThrow(_cursor, "died");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfAliases = CursorUtil.getColumnIndexOrThrow(_cursor, "aliases");
      final int _cursorIndexOfFather = CursorUtil.getColumnIndexOrThrow(_cursor, "father");
      final int _cursorIndexOfMother = CursorUtil.getColumnIndexOrThrow(_cursor, "mother");
      final int _cursorIndexOfSpouse = CursorUtil.getColumnIndexOrThrow(_cursor, "spouse");
      final int _cursorIndexOfHouseId = CursorUtil.getColumnIndexOrThrow(_cursor, "houseId");
      final Character _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGender;
        _tmpGender = _cursor.getString(_cursorIndexOfGender);
        final String _tmpCulture;
        _tmpCulture = _cursor.getString(_cursorIndexOfCulture);
        final String _tmpBorn;
        _tmpBorn = _cursor.getString(_cursorIndexOfBorn);
        final String _tmpDied;
        _tmpDied = _cursor.getString(_cursorIndexOfDied);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpAliases;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfAliases);
        _tmpAliases = __listConverter.fromString(_tmp_1);
        final String _tmpFather;
        _tmpFather = _cursor.getString(_cursorIndexOfFather);
        final String _tmpMother;
        _tmpMother = _cursor.getString(_cursorIndexOfMother);
        final String _tmpSpouse;
        _tmpSpouse = _cursor.getString(_cursorIndexOfSpouse);
        final String _tmpHouseId;
        _tmpHouseId = _cursor.getString(_cursorIndexOfHouseId);
        _result = new Character(_tmpId,_tmpName,_tmpGender,_tmpCulture,_tmpBorn,_tmpDied,_tmpTitles,_tmpAliases,_tmpFather,_tmpMother,_tmpSpouse,_tmpHouseId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Character getCharacterByName(final String key) {
    final String _sql = "SELECT * FROM character_table WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfCulture = CursorUtil.getColumnIndexOrThrow(_cursor, "culture");
      final int _cursorIndexOfBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "born");
      final int _cursorIndexOfDied = CursorUtil.getColumnIndexOrThrow(_cursor, "died");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfAliases = CursorUtil.getColumnIndexOrThrow(_cursor, "aliases");
      final int _cursorIndexOfFather = CursorUtil.getColumnIndexOrThrow(_cursor, "father");
      final int _cursorIndexOfMother = CursorUtil.getColumnIndexOrThrow(_cursor, "mother");
      final int _cursorIndexOfSpouse = CursorUtil.getColumnIndexOrThrow(_cursor, "spouse");
      final int _cursorIndexOfHouseId = CursorUtil.getColumnIndexOrThrow(_cursor, "houseId");
      final Character _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGender;
        _tmpGender = _cursor.getString(_cursorIndexOfGender);
        final String _tmpCulture;
        _tmpCulture = _cursor.getString(_cursorIndexOfCulture);
        final String _tmpBorn;
        _tmpBorn = _cursor.getString(_cursorIndexOfBorn);
        final String _tmpDied;
        _tmpDied = _cursor.getString(_cursorIndexOfDied);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpAliases;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfAliases);
        _tmpAliases = __listConverter.fromString(_tmp_1);
        final String _tmpFather;
        _tmpFather = _cursor.getString(_cursorIndexOfFather);
        final String _tmpMother;
        _tmpMother = _cursor.getString(_cursorIndexOfMother);
        final String _tmpSpouse;
        _tmpSpouse = _cursor.getString(_cursorIndexOfSpouse);
        final String _tmpHouseId;
        _tmpHouseId = _cursor.getString(_cursorIndexOfHouseId);
        _result = new Character(_tmpId,_tmpName,_tmpGender,_tmpCulture,_tmpBorn,_tmpDied,_tmpTitles,_tmpAliases,_tmpFather,_tmpMother,_tmpSpouse,_tmpHouseId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Character> getAllCharacters() {
    final String _sql = "SELECT * FROM character_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfCulture = CursorUtil.getColumnIndexOrThrow(_cursor, "culture");
      final int _cursorIndexOfBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "born");
      final int _cursorIndexOfDied = CursorUtil.getColumnIndexOrThrow(_cursor, "died");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfAliases = CursorUtil.getColumnIndexOrThrow(_cursor, "aliases");
      final int _cursorIndexOfFather = CursorUtil.getColumnIndexOrThrow(_cursor, "father");
      final int _cursorIndexOfMother = CursorUtil.getColumnIndexOrThrow(_cursor, "mother");
      final int _cursorIndexOfSpouse = CursorUtil.getColumnIndexOrThrow(_cursor, "spouse");
      final int _cursorIndexOfHouseId = CursorUtil.getColumnIndexOrThrow(_cursor, "houseId");
      final List<Character> _result = new ArrayList<Character>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Character _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGender;
        _tmpGender = _cursor.getString(_cursorIndexOfGender);
        final String _tmpCulture;
        _tmpCulture = _cursor.getString(_cursorIndexOfCulture);
        final String _tmpBorn;
        _tmpBorn = _cursor.getString(_cursorIndexOfBorn);
        final String _tmpDied;
        _tmpDied = _cursor.getString(_cursorIndexOfDied);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpAliases;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfAliases);
        _tmpAliases = __listConverter.fromString(_tmp_1);
        final String _tmpFather;
        _tmpFather = _cursor.getString(_cursorIndexOfFather);
        final String _tmpMother;
        _tmpMother = _cursor.getString(_cursorIndexOfMother);
        final String _tmpSpouse;
        _tmpSpouse = _cursor.getString(_cursorIndexOfSpouse);
        final String _tmpHouseId;
        _tmpHouseId = _cursor.getString(_cursorIndexOfHouseId);
        _item = new Character(_tmpId,_tmpName,_tmpGender,_tmpCulture,_tmpBorn,_tmpDied,_tmpTitles,_tmpAliases,_tmpFather,_tmpMother,_tmpSpouse,_tmpHouseId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Character getLastCharacter() {
    final String _sql = "SELECT * FROM character_table ORDER BY id DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfCulture = CursorUtil.getColumnIndexOrThrow(_cursor, "culture");
      final int _cursorIndexOfBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "born");
      final int _cursorIndexOfDied = CursorUtil.getColumnIndexOrThrow(_cursor, "died");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfAliases = CursorUtil.getColumnIndexOrThrow(_cursor, "aliases");
      final int _cursorIndexOfFather = CursorUtil.getColumnIndexOrThrow(_cursor, "father");
      final int _cursorIndexOfMother = CursorUtil.getColumnIndexOrThrow(_cursor, "mother");
      final int _cursorIndexOfSpouse = CursorUtil.getColumnIndexOrThrow(_cursor, "spouse");
      final int _cursorIndexOfHouseId = CursorUtil.getColumnIndexOrThrow(_cursor, "houseId");
      final Character _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGender;
        _tmpGender = _cursor.getString(_cursorIndexOfGender);
        final String _tmpCulture;
        _tmpCulture = _cursor.getString(_cursorIndexOfCulture);
        final String _tmpBorn;
        _tmpBorn = _cursor.getString(_cursorIndexOfBorn);
        final String _tmpDied;
        _tmpDied = _cursor.getString(_cursorIndexOfDied);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpAliases;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfAliases);
        _tmpAliases = __listConverter.fromString(_tmp_1);
        final String _tmpFather;
        _tmpFather = _cursor.getString(_cursorIndexOfFather);
        final String _tmpMother;
        _tmpMother = _cursor.getString(_cursorIndexOfMother);
        final String _tmpSpouse;
        _tmpSpouse = _cursor.getString(_cursorIndexOfSpouse);
        final String _tmpHouseId;
        _tmpHouseId = _cursor.getString(_cursorIndexOfHouseId);
        _result = new Character(_tmpId,_tmpName,_tmpGender,_tmpCulture,_tmpBorn,_tmpDied,_tmpTitles,_tmpAliases,_tmpFather,_tmpMother,_tmpSpouse,_tmpHouseId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Character> getCharactersFromHouse(final String houseId) {
    final String _sql = "SELECT * FROM character_table WHERE houseId LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (houseId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, houseId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfCulture = CursorUtil.getColumnIndexOrThrow(_cursor, "culture");
      final int _cursorIndexOfBorn = CursorUtil.getColumnIndexOrThrow(_cursor, "born");
      final int _cursorIndexOfDied = CursorUtil.getColumnIndexOrThrow(_cursor, "died");
      final int _cursorIndexOfTitles = CursorUtil.getColumnIndexOrThrow(_cursor, "titles");
      final int _cursorIndexOfAliases = CursorUtil.getColumnIndexOrThrow(_cursor, "aliases");
      final int _cursorIndexOfFather = CursorUtil.getColumnIndexOrThrow(_cursor, "father");
      final int _cursorIndexOfMother = CursorUtil.getColumnIndexOrThrow(_cursor, "mother");
      final int _cursorIndexOfSpouse = CursorUtil.getColumnIndexOrThrow(_cursor, "spouse");
      final int _cursorIndexOfHouseId = CursorUtil.getColumnIndexOrThrow(_cursor, "houseId");
      final List<Character> _result = new ArrayList<Character>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Character _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGender;
        _tmpGender = _cursor.getString(_cursorIndexOfGender);
        final String _tmpCulture;
        _tmpCulture = _cursor.getString(_cursorIndexOfCulture);
        final String _tmpBorn;
        _tmpBorn = _cursor.getString(_cursorIndexOfBorn);
        final String _tmpDied;
        _tmpDied = _cursor.getString(_cursorIndexOfDied);
        final List<String> _tmpTitles;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfTitles);
        _tmpTitles = __listConverter.fromString(_tmp);
        final List<String> _tmpAliases;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfAliases);
        _tmpAliases = __listConverter.fromString(_tmp_1);
        final String _tmpFather;
        _tmpFather = _cursor.getString(_cursorIndexOfFather);
        final String _tmpMother;
        _tmpMother = _cursor.getString(_cursorIndexOfMother);
        final String _tmpSpouse;
        _tmpSpouse = _cursor.getString(_cursorIndexOfSpouse);
        final String _tmpHouseId;
        _tmpHouseId = _cursor.getString(_cursorIndexOfHouseId);
        _item = new Character(_tmpId,_tmpName,_tmpGender,_tmpCulture,_tmpBorn,_tmpDied,_tmpTitles,_tmpAliases,_tmpFather,_tmpMother,_tmpSpouse,_tmpHouseId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
