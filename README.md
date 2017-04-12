<img src=https://cloud.githubusercontent.com/assets/6883670/22938783/bbef4474-f2d4-11e6-92a5-07c1a6964491.png width=220 height=100 />

# PDBe Widget
Shows molecules structure from pdbe

<img src="pdbe-example.png " align="center" alt="pdb widget example">

## How to use the widget?

First add EBI Nexus repository in your pom.xml file

```xml
    <repositories>
        ...
        <!-- EBI repo -->
        <repository>
            <id>nexus-ebi-repo</id>
            <name>The EBI internal repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-repo/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
        <!-- EBI SNAPSHOT repo -->
        <repository>
            <id>nexus-ebi-snapshot-repo</id>
            <name>The EBI internal snapshot repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-snapshots/</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
```

Then add the pdbe dependency

```xml
    <dependencies>
        ...
        <dependency>
            <groupId>uk.ac.ebi.pwp.widgets</groupId>
            <artifactId>pdb</artifactId>
            <version>2.1.1</version>
        </dependency>
    <dependencies>
```
    
In your project main html file add the following pdbe javascript dependencies

```xml
    <!--PDBe dependencies-->
    <script type="text/javascript" language="JavaScript" src="http://www.ebi.ac.uk:80/pdbe-apps/widgets/js/essential.js"></script>
    <script type="text/javascript" language="JavaScript" src="http://www.ebi.ac.uk:80/pdbe-apps/widgets/js/basic.js"></script>
    <script type="text/javascript" language="JavaScript" src="http://www.ebi.ac.uk:80/pdbe-apps/widgets/js/pdbprints.js"></script>
```

The PDBViewer panel can be created as follows and then placed in the right placeholder  
    
```java    
    PDBViewer pdbViewer = new PDBViewer("P35568", "UniProt:P35568 IRS1")
```
