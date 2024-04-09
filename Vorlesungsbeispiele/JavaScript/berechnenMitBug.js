function berechnen() {
  var zahl1 = Number(inputs[0].value);
  var zahl2 = Number(inputs[1].value);
  summe(zahl1,zahl2);
  differenz(zahl1,zahl2);
  produkt(zahl1,zahl2);
  quotient(zahl1,zahl2);
}

function summe(zahl1, zahl2) {
	append(zahl1 + ' + ' + zahl2 + ' = ' + zahl1 + zahl2);
}

function differenz(zahl1, zahl2) {
	append(zahl1 + ' - ' + zahl2 + ' = ' + (zahl1 - zahl2));
}

function produkt(zahl1, zahl2) {
	append(zahl1 + ' * ' + zahl2 + ' = ' + (zahl1 * zahl2));
}

function quotient(zahl1, zahl2) {
	append(zahl1 + ' / ' + zahl2 + ' = ' + (zahl1 / zahl2));
}

function append(txt) {
	var divElem = document.createElement("div");
	var node = document.createTextNode(txt);
	divElem.appendChild(node);
	label.append(divElem);
}

var inputs = document.querySelectorAll('input');
var label = document.querySelector('p');
var button = document.querySelector('button');
button.addEventListener('click', berechnen);