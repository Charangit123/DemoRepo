package retryAnalyser;

import java.lang.reflect.Constructor;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annote, Class testclass, Constructor testConstruct, java.lang.reflect.Method testMethod) {
		
		annote.setRetryAnalyzer(Retryanalyser.class);
		
	}
	

}
