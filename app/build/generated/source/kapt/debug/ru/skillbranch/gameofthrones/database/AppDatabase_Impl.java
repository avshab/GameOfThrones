package ru.skillbranch.gameofthrones.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDatabaseDao _appDatabaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `house_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `region` TEXT NOT NULL, `coatOfArms` TEXT NOT NULL, `words` TEXT NOT NULL, `seats` TEXT NOT NULL, `titles` TEXT NOT NULL, `currentLord` TEXT NOT NULL, `heir` TEXT NOT NULL, `overlord` TEXT NOT NULL, `founded` TEXT NOT NULL, `founder` TEXT NOT NULL, `diedOut` TEXT NOT NULL, `ancestralWeapons` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `character_table` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `gender` TEXT NOT NULL, `culture` TEXT NOT NULL, `born` TEXT NOT NULL, `died` TEXT NOT NULL, `titles` TEXT NOT NULL, `aliases` TEXT NOT NULL, `father` TEXT NOT NULL, `mother` TEXT NOT NULL, `spouse` TEXT NOT NULL, `houseId` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e5f3029a0fdc08bdc3c27226214ad9c9')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `house_table`");
        _db.execSQL("DROP TABLE IF EXISTS `character_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
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
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHouseTable = new HashMap<String, TableInfo.Column>(14);
        _columnsHouseTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("region", new TableInfo.Column("region", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("coatOfArms", new TableInfo.Column("coatOfArms", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("words", new TableInfo.Column("words", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("seats", new TableInfo.Column("seats", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("titles", new TableInfo.Column("titles", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("currentLord", new TableInfo.Column("currentLord", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("heir", new TableInfo.Column("heir", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("overlord", new TableInfo.Column("overlord", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("founded", new TableInfo.Column("founded", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("founder", new TableInfo.Column("founder", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("diedOut", new TableInfo.Column("diedOut", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHouseTable.put("ancestralWeapons", new TableInfo.Column("ancestralWeapons", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHouseTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHouseTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHouseTable = new TableInfo("house_table", _columnsHouseTable, _foreignKeysHouseTable, _indicesHouseTable);
        final TableInfo _existingHouseTable = TableInfo.read(_db, "house_table");
        if (! _infoHouseTable.equals(_existingHouseTable)) {
          return new RoomOpenHelper.ValidationResult(false, "house_table(ru.skillbranch.gameofthrones.data.local.entities.House).\n"
                  + " Expected:\n" + _infoHouseTable + "\n"
                  + " Found:\n" + _existingHouseTable);
        }
        final HashMap<String, TableInfo.Column> _columnsCharacterTable = new HashMap<String, TableInfo.Column>(12);
        _columnsCharacterTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("culture", new TableInfo.Column("culture", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("born", new TableInfo.Column("born", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("died", new TableInfo.Column("died", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("titles", new TableInfo.Column("titles", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("aliases", new TableInfo.Column("aliases", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("father", new TableInfo.Column("father", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("mother", new TableInfo.Column("mother", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("spouse", new TableInfo.Column("spouse", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterTable.put("houseId", new TableInfo.Column("houseId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCharacterTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCharacterTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCharacterTable = new TableInfo("character_table", _columnsCharacterTable, _foreignKeysCharacterTable, _indicesCharacterTable);
        final TableInfo _existingCharacterTable = TableInfo.read(_db, "character_table");
        if (! _infoCharacterTable.equals(_existingCharacterTable)) {
          return new RoomOpenHelper.ValidationResult(false, "character_table(ru.skillbranch.gameofthrones.data.local.entities.Character).\n"
                  + " Expected:\n" + _infoCharacterTable + "\n"
                  + " Found:\n" + _existingCharacterTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e5f3029a0fdc08bdc3c27226214ad9c9", "0fd00d4a749b3c7139404e1eb27d911b");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "house_table","character_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `house_table`");
      _db.execSQL("DELETE FROM `character_table`");
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
  public AppDatabaseDao getAppDatabaseDao() {
    if (_appDatabaseDao != null) {
      return _appDatabaseDao;
    } else {
      synchronized(this) {
        if(_appDatabaseDao == null) {
          _appDatabaseDao = new AppDatabaseDao_Impl(this);
        }
        return _appDatabaseDao;
      }
    }
  }
}
