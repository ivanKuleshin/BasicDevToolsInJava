Данный принцип гласит: Класс должен быть ответственен лишь за что-то одно. То есть, никогда не должно быть
больше одной причины изменить класс.

Если класс отвечает за решение нескольких задач, то его подсистемы оказываются связанными друг с другом.
Изменения в одной такой подсистеме ведут к изменениям в другой.

Такие классы всегда будет просто изменять, если это понадобится, потому что понятно, за что класс отвечает,
а за что — нет. То есть можно будет вносить изменения и не бояться последствий — влияния на другие объекты. А еще подобный код гораздо проще тестировать, ведь вы покрываете тестами одну функциональность в изоляции от всех остальных.