all:
	$(MAKE) com.data
	$(MAKE) com.core
	javac ./Main.java
	java Main

com.core:
	javac com/core/*.java

com.data:
	javac com/data/*.java
