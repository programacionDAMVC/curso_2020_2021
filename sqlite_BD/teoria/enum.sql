DROP TABLE IF EXISTS ejemplo;
CREATE TABLE ejemplo (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT CHECK (nombre IN ('uno', 'dos', 'tres')) NOT NULL DEFAULT 'uno'
       
);

