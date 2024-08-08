### ![Actions Status](https://github.com/Evlit/java-project-71/actions/workflows/hexlet-check.yml/badge.svg)![Java CI](https://github.com/Evlit/java-project-71/actions/workflows/main.yml/badge.svg)![maintainability](https://api.codeclimate.com/v1/badges/34bdb06d58fb1c7cdc57/maintainability)![test_coverage](https://api.codeclimate.com/v1/badges/34bdb06d58fb1c7cdc57/test_coverage)

## **Проект №2 "Вычислитель отличий"**

Консольная программа (приложение и библиотека), показывающая разницу двух сравниваемых файлов.
Поддерживается сравнение файлов в форматах json или yaml.
Результат сравнения выводится на экран. Форматы вывода - json, text plain или stylish - указываются  ключем -f.
##### Для сборки проекта наберите в рабочей директории проекта: 
make install
##### Запуск и выбор формата сравнения
./build/install/app/bin/app filepath1.json filepath2.json
./build/install/app/bin/app -f format filepath1.json filepath2.json

Примеры запуска в разных вариантах представлены в аскинеме ниже:
### Project asciinemas:
[![asciicast](https://asciinema.org/a/670006.svg)](https://asciinema.org/a/670006)