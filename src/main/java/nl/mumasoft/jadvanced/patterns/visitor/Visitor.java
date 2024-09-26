package nl.mumasoft.jadvanced.patterns.visitor;

public interface Visitor
{
	void visit(Apple apple);
	void visit(Pear pear);
	void visit(Fruitmand fruits);
	void visit(Banana banana);
}
