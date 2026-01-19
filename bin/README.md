EXERCICE 4 : ANALYSE CRITIQUE

Question 1 : Le pattern Visiteur est-il réellement pertinent ?

OUI, car :
- On peut ajouter plusieurs comportements sans modifier les classes Expression
- Les classes Expression restent stables
- Respecte le principe Open/Closed

MAIS : Pour seulement 1-2 opérations, des méthodes directes auraient suffi.

---

Question 2 : Quelles sont les limites ?

1. Ajouter un nouveau type d'expression modifie ExpressionVisitor et TOUS les visiteurs
2. Type casting systématique nécessaire
3. Double dispatch (accept + visit) plus complexe
4. Difficile de passer des paramètres supplémentaires
5. Interface Visitor devient grosse

---

Question 3 : Opérations plus naturelles dans Expression ?

OUI pour :
- Affichage simple : une méthode toString() serait plus simple
- Calcul simple : une méthode evaluer(Map) serait plus intuitive

MAIS : Pour logique complexe (dérivée, simplification), le Visiteur est meilleur

---

Question 4 : Simplifier la hiérarchie pour cos ?

OUI : Faire "class Cos extends Expression" au lieu de "Cos (Fonction) + FonctionExpression"

Avantages : Plus simple
Inconvénient : Il faut modifier ExpressionVisitor pour chaque nouvelle fonction

---

Question 5 : Ajouter un nouveau type d'expression ?

Problème en cascade :
- Modifier ExpressionVisitor
- TOUS les visiteurs cassent et doivent être mis à jour
- Exemple : ajouter Sin = modifier 5+ fichiers

