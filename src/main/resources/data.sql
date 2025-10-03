-- Users
INSERT INTO users(id, first_name, last_name) VALUES (1, 'Alice', 'Dupont');
INSERT INTO users(id, first_name, last_name) VALUES (2, 'Bob', 'Martin');

-- Tasks (owner_id référence users.id)
INSERT INTO tasks(id, title, description, owner_id) VALUES (1, 'Fix bug', 'Corriger un bug critique', 1);
INSERT INTO tasks(id, title, description, owner_id) VALUES (2, 'Write docs', 'Rédiger la doc API', 2);
INSERT INTO tasks(id, title, description, owner_id) VALUES (3, 'No owner task', 'Tâche sans propriétaire', NULL);
