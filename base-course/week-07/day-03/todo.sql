CREATE DATABASE IF NOT EXISTS todo;
USE todo;

CREATE TABLE IF NOT EXISTS task (
id INT unsigned NOT NULL AUTO_INCREMENT,
action VARCHAR(144) NOT NULL,
done BOOLEAN,
urgent BOOLEAN,
PRIMARY KEY (id)
);

INSERT INTO task (action, done, urgent)
VALUES ('Water plants', false, true), ('Open bakery', false, false), ('Get a car',  false, false), ('Play WoW', true, false);

SELECT * FROM task;

UPDATE task
SET action = "Eat lasagne"
WHERE id=4;

DELETE FROM task
WHERE id = 3;

