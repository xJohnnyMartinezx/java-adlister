use adlister_db;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(

    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(25) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(30) NOT NULL,
    PRIMARY KEY (id)
);



DROP TABLE IF EXISTS ads;

CREATE TABLE IF NOT EXISTS ads(

    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);