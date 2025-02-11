INSERT INTO role (name) VALUES ('USER');
INSERT INTO role (name) VALUES ('ADMIN');

INSERT INTO user (username, password, role_id) VALUES ('user1', 'password1', (SELECT id FROM role WHERE name='USER'));
INSERT INTO user (username, password, role_id) VALUES ('admin1', 'password1', (SELECT id FROM role WHERE name='ADMIN'));

INSERT INTO book (title, author, category, rating) VALUES ('Book Title 1', 'Author 1', 'Fiction', 4.5);
INSERT INTO book (title, author, category, rating) VALUES ('Book Title 2', 'Author 2', 'Non-Fiction', 4.0);
INSERT INTO book (title, author, category, rating) VALUES ('Book Title 3', 'Author 3', 'Science', 5.0);

INSERT INTO favorite_books (user_id, book_id) VALUES ((SELECT id FROM user WHERE username='user1'), (SELECT id FROM book WHERE title='Book Title 1'));
INSERT INTO favorite_books (user_id, book_id) VALUES ((SELECT id FROM user WHERE username='user1'), (SELECT id FROM book WHERE title='Book Title 2'));