CREATE DATABASE cargo_transportation_system;

USE cargo_transportation_system;

CREATE TABLE cargo
(
    id INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    type             VARCHAR(255) NOT NULL,
    content          VARCHAR(255) NOT NULL,
    dispatch_address VARCHAR(255) NOT NULL,
    delivery_address VARCHAR(255) NOT NULL,
    weight           FLOAT        NOT NULL,
    driver_name      VARCHAR(255) NOT NULL,
    model            VARCHAR(255) NOT NULL,
    car_number       VARCHAR(255) NOT NULL,
    dispatch_date    DATE         NOT NULL,
    delivery_date    DATE         NOT NULL

) ENGINE = InnoDB DEFAULT CHARSET = `UTF8MB4`;

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Смартфоны', 'Москва', 'Санкт-Петербург', 2500, 'Иванов И.И.', 'Mercedes-Benz Actros', 'А123АА77', '2022-05-15', '2022-05-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Одежда', 'Платья', 'Екатеринбург', 'Новосибирск', 1500, 'Смирнова Е.А.', 'Volvo FH16', 'К987КУ99', '2022-08-10', '2022-08-15');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Фрукты', 'Ростов-на-Дону', 'Краснодар', 500, 'Петров А.С.', 'MAN TGA', 'О567ОМ77', '2021-12-01', '2021-12-05');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Цемент', 'Самара', 'Волгоград', 4000, 'Соколов Д.М.', 'Scania R-Series', 'Е543КЕ98', '2023-02-20', '2023-02-25');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Стол и стулья', 'Казань', 'Уфа', 800, 'Лебедев В.Н.', 'Iveco Stralis', 'Р765РЕ36', '2020-07-05', '2020-07-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Химические вещества', 'Кислота', 'Нижний Новгород', 'Калининград', 300, 'Козлов С.В.', 'DAF XF', 'А987АХ47', '2022-11-12', '2022-11-17');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Тормозные колодки', 'Пермь', 'Омск', 200, 'Сидоров Н.Д.', 'Renault Magnum', 'Р543РЕ63', '2021-09-20', '2021-09-23');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Ноутбуки', 'Красноярск', 'Иркутск', 1800, 'Павлова О.В.', 'Dell Latitude', 'У765ХТ36', '2023-04-05', '2023-04-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Молочные продукты', 'Владивосток', 'Хабаровск', 300, 'Ковалев Е.П.', 'Toyota Dyna', 'К234КУ77', '2021-11-25', '2021-11-30');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Доски', 'Ульяновск', 'Саратов', 1200, 'Соловьев А.И.', 'Isuzu NQR', 'А756АМ47', '2022-09-12', '2022-09-17');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Одежда', 'Обувь', 'Челябинск', 'Пермь', 600, 'Никитин В.А.', 'MAN TGX', 'Р654РС36', '2020-12-01', '2020-12-06');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Диваны', 'Сочи', 'Ростов-на-Дону', 2000, 'Крылова Л.С.', 'Scania P-Series', 'О987ОА77', '2023-01-20', '2023-01-25');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Химические вещества', 'Пестициды', 'Самара', 'Уфа', 400, 'Богданов К.В.', 'Volvo FH', 'К543КУ96', '2022-07-10', '2022-07-15');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Аккумуляторы', 'Новосибирск', 'Омск', 150, 'Морозов Г.И.', 'Iveco Eurocargo', 'М764ОО99', '2021-10-15', '2021-10-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Телевизоры', 'Москва', 'Санкт-Петербург', 3000, 'Смирнов П.И.', 'Samsung QLED', 'Е123УУ77', '2022-05-15', '2022-05-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Одежда', 'Куртки', 'Екатеринбург', 'Новосибирск', 1200, 'Козлова А.М.', 'Zara', 'К543КТ99', '2022-08-10', '2022-08-15');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Мясо', 'Ростов-на-Дону', 'Краснодар', 700, 'Иванов П.А.', 'Kia K2700', 'А567АМ77', '2021-12-01', '2021-12-05');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Кирпич', 'Самара', 'Волгоград', 5000, 'Сидоров В.Д.', 'MAN TGS', 'Е543ЕУ98', '2023-02-20', '2023-02-25');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Шкафы', 'Казань', 'Уфа', 1000, 'Михайлов В.Н.', 'Iveco Daily', 'Р765РУ36', '2020-07-05', '2020-07-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Химические вещества', 'Растворитель', 'Нижний Новгород', 'Калининград', 400, 'Петров С.В.', 'DAF CF', 'А987АА47', '2022-11-12', '2022-11-17');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Наушники', 'Москва', 'Санкт-Петербург', 500, 'Кузнецов А.С.', 'Sony WH-1000XM4', 'М987АТ77', '2022-05-15', '2022-05-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Овощи', 'Ростов-на-Дону', 'Краснодар', 400, 'Соколова Н.В.', 'Volkswagen Transporter', 'К234ЕР77', '2021-12-01', '2021-12-05');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Стулья', 'Казань', 'Уфа', 600, 'Ильин В.М.', 'Iveco Eurocargo', 'О987ОО77', '2020-07-05', '2020-07-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Шины', 'Новосибирск', 'Омск', 300, 'Морозов Г.И.', 'Scania R-Series', 'М764ОО99', '2021-10-15', '2021-10-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Стекло', 'Самара', 'Волгоград', 1500, 'Сидоров В.Д.', 'MAN TGS', 'Е543ЕУ98', '2023-02-20', '2023-02-25');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Фрукты', 'Москва', 'Санкт-Петербург', 800, 'Иванова Е.С.', 'Volvo FH16', 'У543МА99', '2022-05-15', '2022-05-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Аккумуляторы', 'Ростов-на-Дону', 'Краснодар', 400, 'Смирнов Д.А.', 'Renault Magnum', 'М765КР77', '2021-12-01', '2021-12-05');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Кирпичи', 'Казань', 'Уфа', 500, 'Петров С.И.', 'Mercedes-Benz Actros', 'О543УУ77', '2020-07-05', '2020-07-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Столы', 'Новосибирск', 'Омск', 400, 'Ковалева М.Н.', 'DAF XF', 'М764УО99', '2021-10-15', '2021-10-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Телевизоры', 'Самара', 'Волгоград', 1200, 'Васильев И.В.', 'Iveco Stralis', 'Е543АУ98', '2023-02-20', '2023-02-25');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Молоко', 'Санкт-Петербург', 'Москва', 700, 'Иванов П.А.', 'Volvo FH16', 'У123КМ77', '2022-05-15', '2022-05-18');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Шины', 'Краснодар', 'Ростов-на-Дону', 300, 'Смирнов Д.А.', 'Renault Magnum', 'О543МО98', '2021-12-01', '2021-12-04');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Песок', 'Уфа', 'Казань', 450, 'Петров С.И.', 'Mercedes-Benz Actros', 'У777КР63', '2020-07-03', '2020-07-08');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Стулья', 'Омск', 'Новосибирск', 350, 'Ковалева М.Н.', 'DAF XF', 'К761ОМ77', '2021-10-12', '2021-10-17');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Ноутбуки', 'Волгоград', 'Самара', 1000, 'Васильев И.В.', 'Iveco Stralis', 'А543АУ99', '2023-02-17', '2023-02-22');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Овощи', 'Москва', 'Санкт-Петербург', 500, 'Сидоров А.И.', 'Scania R-series', 'Е123МЕ33', '2022-02-28', '2022-03-04');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Аккумуляторы', 'Ростов-на-Дону', 'Краснодар', 400, 'Кузнецов Е.С.', 'MAN TGX', 'К455КА777', '2021-06-20', '2021-06-24');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Цемент', 'Казань', 'Уфа', 600, 'Морозов В.П.', 'Volvo FH12', 'Р456РО178', '2020-09-15', '2020-09-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Столы', 'Новосибирск', 'Омск', 300, 'Ильин К.С.', 'DAF CF', 'О623СА64', '2021-11-05', '2021-11-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Телевизоры', 'Самара', 'Волгоград', 800, 'Григорьев Д.В.', 'Mercedes-Benz Atego', 'Т543ТУ77', '2023-01-08', '2023-01-13');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Фрукты', 'Москва', 'Санкт-Петербург', 350, 'Иванов А.Н.', 'Scania R-series', 'Е456МЕ33', '2022-01-15', '2022-01-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Шины', 'Ростов-на-Дону', 'Краснодар', 550, 'Кузнецов Е.С.', 'MAN TGX', 'К777КА456', '2021-06-20', '2021-06-24');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Песок', 'Казань', 'Уфа', 700, 'Морозов В.П.', 'Volvo FH12', 'Р178РО456', '2020-09-15', '2020-09-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Стулья', 'Новосибирск', 'Омск', 250, 'Ильин К.С.', 'DAF CF', 'О77СА623', '2021-11-05', '2021-11-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Смартфоны', 'Самара', 'Волгоград', 950, 'Григорьев Д.В.', 'Mercedes-Benz Atego', 'Т77ТУ543', '2023-01-08', '2023-01-13');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Продукты питания', 'Молоко', 'Санкт-Петербург', 'Москва', 300, 'Смирнов А.В.', 'Volvo FH16', 'О889ОХ159', '2021-02-05', '2021-02-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Автозапчасти', 'Аккумуляторы', 'Краснодар', 'Ростов-на-Дону', 450, 'Петров Н.И.', 'Renault Premium', 'Е179УМ777', '2021-06-20', '2021-06-24');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Строительные материалы', 'Кирпичи', 'Уфа', 'Казань', 600, 'Соколов В.С.', 'Iveco Stralis', 'О156МХ777', '2020-09-15', '2020-09-20');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Мебель', 'Столы', 'Омск', 'Новосибирск', 200, 'Федоров С.В.', 'MAN TGS', 'Р453РК123', '2021-11-05', '2021-11-10');

INSERT INTO cargo (type, content, dispatch_address, delivery_address, weight, driver_name, model, car_number, dispatch_date, delivery_date)
VALUES ('Электроника', 'Ноутбуки', 'Волгоград', 'Самара', 900, 'Беляев Д.А.', 'Scania S-series', 'Т777ОО321', '2023-01-08', '2023-01-13');
