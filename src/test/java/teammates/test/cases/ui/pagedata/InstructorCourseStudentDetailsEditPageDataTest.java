package teammates.test.cases.ui.pagedata;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import teammates.ui.controller.InstructorCourseStudentDetailsPageData;

public class InstructorCourseStudentDetailsEditPageDataTest extends InstructorCourseStudentDetailsPageDataTest {
    @BeforeClass
    public static void classSetUp() {
        printTestClassHeader();
    }
    
    @Test
    public void allTests() {
        InstructorCourseStudentDetailsPageData data = createData();
        
        assertNull(data.getStudentProfile());
        testStudentInfoTable(data.getStudentInfoTable());
        assertEquals(commentRecipient, data.getCommentRecipient());
    }
    
    protected InstructorCourseStudentDetailsPageData createData() {
        String name = "John Doe";
        String email = "john@doe.com";
        
        createStudent(name, email);
        return super.createData();
    }
}