create table catalog (
   id INTEGER auto_increment PRIMARY KEY,
   action VARCHAR(255),
   type VARCHAR(255),
   uri VARCHAR(255)
);

create table fish (
   id VARCHAR(255) PRIMARY KEY,
   name VARCHAR(255),
   available INTEGER,
   unit_price NUMERIC(20,2)
);