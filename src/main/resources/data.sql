INSERT INTO users(first_name, last_name) VALUES ('Alice', 'Dupont');
INSERT INTO users(first_name, last_name) VALUES ('Bob', 'Martin');

INSERT INTO tasks(title, description, owner_id) VALUES ('Fix bug', 'Corriger un bug critique', 1);
INSERT INTO tasks(title, description, owner_id) VALUES ('Write docs', 'Rédiger la doc API', 2);
INSERT INTO tasks(title, description, owner_id) VALUES ('No owner task', 'Tâche sans propriétaire', NULL);
