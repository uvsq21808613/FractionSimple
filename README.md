Pour l'ensemble des TDs, vous créerez un compte individuel sur github.
Vous nommerez ce compte de la façon suivante: uvsq<MonNuméroÉtudiant>.
Par exemple, pour un étudiant de numéro 21601234, le compte sera uvsq21601234.
Les commandes git sont à taper en ligne de commande dans un shell.
Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, Eclipse, IntelliJ IDEA et Visual Studio Code sont installés.
Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants
Vous déposerez une archive contenant l'ensemble de votre travail sur Moodle.
Partie en présentiel : découverte de git
Dans cet exercice, vous créerez une classe Fraction représentant un nombre rationnel et une classe Main qui testera les méthodes de la classe Fraction avec des assertions.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

Sur la forge, créez le projet Java SimpleFraction;
En terme de commits, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases Initialize this repository with et n'en cocher aucune ?
la difference entre les deux c'est quand on coches une cases au moins la fonction principale main est passée comme branche principale par defaut .

Pour la suite, ne cochez aucune de ces cases.

Localement, configurez git avec votre nom (user.name) et votre email (user.email);
Par les commandes suivantes :
git config--global user.name "uvsq21808613"
git config --global user.email "uvsq21808613"

Initialisez le dépôt git local pour le projet;
git init

Créez la classe Fraction (vide pour le moment) et la classe Main (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;

Commandes pour valider les changements
git commit –m “Main.java”

Ajoutez un constructeur et la méthode toString à la classe Fraction et modifiez la classe Main en conséquence;
Validez les changements;

// Code pour tester toString
Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole https pour cela;
Vérifiez avec le navigateur;

git push origin master
Sur la forge, ajoutez un fichier de documentation README.md.
Quelle syntaxe est utilisée pour ce fichier ?

Répondre ici

Récupérez localement les modifications effectuées sur la forge.

git clone README.md
Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par git (fichier .gitignore);

```git grep  -- `git ls-files | grep -v 
Retirez les fichiers de configuration de l'IDE du projet;
git --rm

Ajoutez-les aux fichiers ignorés par `git`.
```bash
# Copier ici les modifications de `.gitignore`
Configurez l'accès par clé publique/clé privée à la forge (cf. Use the SSH protocol with Bitbucket Cloud).

Expliquez la procédure de façon synthétique

Partie en distanciel : révisions et perfectionnement shell et IDE
Maîtriser le shell de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du shell de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (bash, Powershell, ...).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, ...).

Quel OS et quel shell de commande utilisez-vous ?

git bash

Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.

help
Donnez la ou les commandes shell permettant de

afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)

git ls-tree HEAD
compter le nombre de ligne d'un fichier

afficher les lignes du fichier Main.java contenant la chaîne uneVariable

git -r- l 'uneVariable'
afficher récursivement les fichiers .java contenant la chaîne uneVariable

# Répondre ici
trouver les fichiers (pas les répertoires) nommés README.md dans une arborescence de répertoires

# Répondre ici
       git-diff-files -         
Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.

ssh
Répondre ici

screen/tmux
Répondre ici

curl/HTTPie
Il fournit une commande http simple qui permet d'envoyer des requêtes HTTP arbitraires en utilisant une syntaxe simple et naturelle, et affiche une sortie colorisée.
jq
'utiliser pour découper, filtrer, mapper et transformer des données structurées
Découverte de votre IDE
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE (IntelliJ IDEA, Visual Studio Code, Eclipse, ...).

Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?

eclipse

Pour la suite, ne considérez que l'un de vos choix.

Comment vérifier/définir que l'encodage utilisé est UTF-8 ?

Répondre ici

Comment choisir le JDK à utiliser dans un projet ?

Répondre ici

Comment préciser la version Java des sources dans un projet ?

Répondre ici

Comment ajouter une bibliothèque externe dans un projet ?

Clic droit sur votre projet->propriétés->java build path -> bibliothèques -> la source de l'attachement aucun -> cliquez sur modifier sélectionner la source à la doc ( java documents généralement représentés par JavaDoc)cliquez sur ok.

Comment reformater un fichier source Java ?
Répondre ici

Comment trouver la déclaration d'une variable ou méthode ?
Répondre ici

Comment insérer un bloc de code prédéfini (snippet) ?
Répondre ici

Comment renommer une classe dans l'ensemble du projet ?
Répondre ici

Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
javac fichier.java
Répondre ici

Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
Répondre ici

Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
l'ajout des bibliothèques
