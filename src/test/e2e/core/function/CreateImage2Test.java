
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class CreateImage2Test extends E2eTestBase {

  public CreateImage2Test() {
    coreCodeTemplate = "img = createImage(66, 66, ARGB)\nimg$loadPixels()\nfor (i in 0:65) {\n    for (j in 0:65) {\n        img$set(i, j, color(0, 90, 102, i * 2))\n    }\n}\nimg$updatePixels()\nimage(img, 17, 17)\nimage(img, 34, 34)\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/createImage_1.png";
  }

  @Test
  public void test() {
    try {
      defaultOperation();
    } catch (Exception exception) {
      System.err.println(exception);
      fail("Should not have thrown any exception");
    }
  }
}