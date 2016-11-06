all:
	$(MAKE) com.core
	$(MAKE) com.data
	javac ./Main.java
	java Main

com.core:
	javac com/core/*.java

com.data:
	javac com/data/*.java
