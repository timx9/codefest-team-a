import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.PutObjectRequest
import com.amazonaws.services.s3.model.PutObjectResult
import spock.lang.Specification

public class CodefestSpec extends Specification {
    def "should upload files"() {
        given:
        AmazonS3 s3client = new AmazonS3Client();

        when:
        PutObjectResult result = s3client.putObject(new PutObjectRequest('codefest-team-a', "articles/test-article-1", new File("/tmp/test.rtf")));

        then:
        result
    }
}
