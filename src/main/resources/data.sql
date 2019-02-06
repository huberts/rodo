-- create table person
-- (
--   id integer not null,
--   name varchar(255) not null,
--   location varchar(255),
--   birth_date timestamp,
--   primary key(id)
-- );

INSERT INTO PERSON (id, name) VALUES (1, 'Hubert Swietlicki');
INSERT INTO PERSON (id, name) VALUES (2, 'John Doe');

INSERT INTO CLIENT (id, name) VALUES (1, 'PODGIK Poznań');
INSERT INTO CLIENT (id, name) VALUES (2, 'GEO Kraków');

INSERT INTO TOPIC (id, name) VALUES (1, 'Wgranie wersji');
INSERT INTO TOPIC (id, name) VALUES (2, 'Poprawka błędu');

INSERT INTO TASK(id, date, person_id, client_id, topic_id, has_personal_data) VALUES (1, CURRENT_TIMESTAMP(), 1, 1, 1, true);