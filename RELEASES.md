# Releases

## How do I create a release and deploy?

	mvn versions:set -DnewVersion=<version>
	mvn versions:commit
	git commit pom.xml -m "Incrementing version for release"
	mvn scm:tag -Dtag=<name>
	mvn versions:set -DnewVersion=<version>
	mvn versions:commit
	git commit pom.xml -m "Incrementing version"

Example:

	mvn versions:set -DnewVersion=1.0.0
	mvn versions:commit
	git commit pom.xml -m "Incrementing version for release"
	mvn clean deploy
	mvn scm:tag -Dtag=1.0.0
	mvn versions:set -DnewVersion=1.0.1-SNAPSHOT
	mvn versions:commit
	git commit pom.xml -m "Incrementing version"