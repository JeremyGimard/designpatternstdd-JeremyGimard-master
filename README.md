# Consignes
Merci de respecter les consignes suivantes pendant l'exécution du devoir.

## Documents autorisés
Ceci est un devoir sur table, où les documents sont habituellement non autorisés.
Cependant une exception sera accordée sur des documents spécifiques.
Toute contravention à ces consignes entraînera une baisse de 5 points de la note finale du devoir, par constat.

1. Seuls les documents de cours sur coursenligne.parisnanterre.fr sont autorisés. Pas de TD, pas de corrigés de TD.
2. Sites internets autorisés : https://www.github.com, la javadoc 1.8 https://docs.oracle.com/javase/8/docs/api/, 
ainsi que le manuel de testng http://testng.org/doc/documentation-main.html.


## Autres consignes
3. Pas de communication entre étudiants pendant le devoir. Toute contravention entraînera une baisse
de 2 points par constat.
4. Pas de communication de code entre étudiants. Toute contravention entraînera une baisse de 10 points
sur la note finale du devoir, suivie de la note obtenue divisée par le nombre d'étudiants concernés.


# Presentation

Les expressions arithmétiques sont écrites en notation infixe et *parenthésées*, les symboles étant séparés d'une espace,
comme dans les exemples suivants : 
1. ( 2 + 3 ) * 4
2. ( x + 3 ) * ( x * 4 )
3. ( x + 10 ) * ( y - 8 )
4. ( x * 3 ) / ( y + 15 )
5. ( y + 0 ) / ( x * 1 )
6. ( O / y ) * ( x / 1 )

L'objectif principal de ce devoir est d'écrire différents visiteurs :
- un visiteur pour l'affichage,
- un visiteur pour l'évaluation avec un environnement indiquant le mapping des variables à des valeurs,
- un visiteur pour simplifier les expressions.

# Travail demandé

Dans l'exécution de ce devoir, il n'est pas demandé de définir des classes d'exception.
Cependant, vous êtes libre de définir des classes d'exception qui vous conviendront,
à n'utiliser que sur les nouvelles méthodes que vous définirez par vous-même.

## Implémentations
Le travail ici concerne les classes où est marqué le tag **TODO**, dans les packages
 **exemples, impl** et **visitors**.

1. Implanter le code de la classe **exemple.ExpressionExemples** pour encoder et retourner 
l'expression correspondant à chacun des exemples ci-dessus (1 à 6).

2. Implanter le code de la classe **visitors.VisitorPrettyPrint** pour afficher une expression *parfaitement parenthésée*,
comme  ( ( 2 + 3 ) * 4 ), ou ( ( x + 3 ) * ( x + 4 ) ).

3. Implanter le code de la classe **visitors.VisitorEval** pour évaluer une expression. Ce visiteur prend en paramètre
un environnement indiquant le mapping des variables à leurs valeurs.


4. Implanter le code de la classe **visitors.VisitorSimplify** pour simplifier une expression, selon les règles de
simplification indiquées ci-après.
Ce visiteur renvoie une expression qui représente l'expression initiale simplifiée.
Pour vous aider à écrire les algorithmes dans cette classe, implantez d'abord le code de
la classe **impl.ExpressionHelper**.

Les règles de simplification sont les suivantes.

4.1 Evaluation des opérations sur les constantes
- 1 + 3 = 4
- 3 * 10 = 30

4.2 Element neutre pour les opérateurs +, -, *, et /
- e + 0 = e
- 0 + e = e
- e - 0 = e
- e * 1 = e
- 1 * e = e
- e / 1 = e

4.3 Elément absorbant pour la multiplication et la division
- e * 0 = 0
- 0 * e = 0
- 0 / e = 0

Rappel: la division par zéro en Java lancera une ArithmeticException.

## Tests

La classe Main fournie n'est pas une vraie classe de test.

5. Ecrivez une classe de test vous permettant de tester *a minima* les 7 cas présents dans la classe Main.
Si vous trouvez du temps, vous pouvez écrire d'autres tests pour couvrir d'autres cas avec les 
6 exemples d'expression fournis (vous pouvez en rajouter d'autres, par exemple tester la division par zéro).