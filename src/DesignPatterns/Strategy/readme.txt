Поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов
и помещает каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять
прямо во время исполнения программы.

Вместо того, чтобы изначальный класс сам выполнял тот или иной алгоритм, он будет играть роль контекста,
ссылаясь на одну из стратегий и делегируя ей выполнение работы.
Чтобы сменить алгоритм, вам будет достаточно подставить в контекст другой объект-стратегию.

Стратегия описывает разные способы произвести одно и то же действие,
позволяя взаимозаменять эти способы в каком-то объекте контекста.