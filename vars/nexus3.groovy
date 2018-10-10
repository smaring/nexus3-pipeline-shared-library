@GrabResolver(name='pentaho.resolve.repo', root='http://nexus.pentaho.org/content/groups/omni', m2Compatible='true')
@Grab('com.hitachivantara.repo:nexus3:1.0.2')
import com.hitachivantara.repo.nexus3.Nexus3RepoManager;

@Grab('org.sonatype.nexus.plugins:nexus-repository-maven:3.13.0-01')
import org.sonatype.nexus.repository.maven.VersionPolicy;

Nexus3RepoManager repo;

def config( String host, int port, String username, String password ) {
  repo = new Nexus3RepoManager( host, port, username, password);
}

def createMavenHostedReleaseRepo( String name ) {
  repo.createMavenHosted( name, VersionPolicy.RELEASE );
}