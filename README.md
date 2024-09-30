# ReseauJava

## Projet informatique de Réseau sous Java

### Simulation d'un terminal Linux.

Vous pouvez tester les commandes CD, GET, LS, MKDIR, PASS, USER PWD, RMDIR, STOR

Vous devez lancer en premier le "Serveur.java", qui va ouvrir le serveur et le mettre en attente de clients. Il y stockera par ailleurs les commandes des utilisateurs.

Ensuite, ouvrez un autre terminal et lancez "Client.java". Vous devrez impérativement effectuer la commande "user" ainsi que "pwd" avant de pouvoir utiliser d'autres commandes.

> "user" étant systématiquement un dossier nommé "user_***" et le mot de passe étant contenu dans ce dossier, dans un fichier texte "pwd.txt"

Quelques fichiers et dossiers sont présents afin de pouvoir tester la commande de suppression.

> L'IHM n'as pas pu être développé, cette partie n'ayant pas été demandée mais proposée. Hors, vous pouvez constater le squelette de l'IHM côté client dans "IHM.java"