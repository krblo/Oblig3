CREATE TABLE biletter
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR(255) NOT NULL,
    antall VARCHAR(255) NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    tlf VARCHAR(255) NOT NULL,
    epost VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);