create schema rental_x;

CREATE USER 'rental_x'@'localhost' IDENTIFIED BY 'rental_x';

GRANT ALL PRIVILEGES ON *.* TO 'rental_x'@'localhost' IDENTIFIED BY 'rental_x' WITH GRANT OPTION;
FLUSH PRIVILEGES;