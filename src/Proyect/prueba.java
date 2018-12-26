package Proyect;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class excel {
	
	private static final String Examen_test = "/Users/melyjram/Desktop/examen.xlsx";
	
	public static void main(String[] args) {
		
			
				XSSFWorkbook workbook = new XSSFWorkbook();
		        XSSFSheet sheet = workbook.createSheet("Sample exam");
		        Object[][] sampleExam = {
		                {"\"1. Deciding How much testing is enough should take into account :"
		                		+ "- i. Level of Risk including Technical and Business product and project risk ii. Project constraints such as time and budget iii. Size of Testing Team iv. Size of the Development \n" + 
		                		" a) i,ii,iii are true and iv is false \n" + 
		                		"b) i,,iv are true and ii is false \n" + 
		                		"c) i,ii are true and iii,iv are false \n" + 
		                		"d) ii,iii,iv are true and i is false\""},
		                {"\"2. When what is visible to end-users is a deviation from the specific or expected\n" + 
		                		"behavior, this is called:\n" + 
		                		"a) an error\n" + 
		                		"b) a fault\n" + 
		                		"c) a failure\n" + 
		                		"d) a defect\n" + 
		                		"e) a mistake\""},
		                {"\"3. Regression testing should be performed:\n" + 
		                		"v) every week\n" + 
		                		"w) after the software has changed\n" + 
		                		"x) as often as possible\n" + 
		                		"y) when the environment has changed\n" + 
		                		"z) when the project manager says\n" + 
		                		"\n" + 
		                		"a) v & w are true, x – z are false\n" + 
		                		"b) w, x & y are true, v & z are false\n" + 
		                		"c) w & y are true, v, x & z are false\n" + 
		                		"d) w is true, v, x y and z are false\n" + 
		                		"e) all of the above are true\""},
		                {"\"4. IEEE 829 test plan documentation standard contains all of the following except:\n" + 
		                		"a) test items\n" + 
		                		"b) test deliverables\n" + 
		                		"c) test tasks\n" + 
		                		"d) test environment\n" + 
		                		"e) test specification\""},
		                {"\"5.  Testing should be stopped when:\n" + 
		                		"a) all the planned tests have been run\n" + 
		                		"b) time has run out\n" + 
		                		"c) all faults have been fixed correctly\n" + 
		                		"d) both a) and c)\n" + 
		                		"e) it depends on the risks for the system being tested\""},
		                {"\"6. Order numbers on a stock control system can range between 10000 and 99999\n" + 
		                		"inclusive. Which of the following inputs might be a result of designing tests for\n" + 
		                		"only valid equivalence classes and valid boundaries:\n" + 
		                		"a) 1000, 5000, 99999\n" + 
		                		"b) 9999, 50000, 100000\n" + 
		                		"c) 10000, 50000, 99999\n" + 
		                		"d) 10000, 99999\n" + 
		                		"e) 9999, 10000, 50000, 99999, 10000\"\""},
		                {"\"7.  Consider the following statements about early test design:\n" + 
		                		"i. early test design can prevent fault multiplication\n" + 
		                		"ii. faults found during early test design are more expensive to fix\n" + 
		                		"iii. early test design can find faults\n" + 
		                		"iv. early test design can cause changes to the requirements\n" + 
		                		"v. early test design takes more effort\n" + 
		                		"\n" + 
		                		"a) i, iii & iv are true. Ii & v are false\n" + 
		                		"b) iii is true, I, ii, iv & v are false\n" + 
		                		"c) iii & iv are true. i, ii & v are false\n" + 
		                		"d) i, iii, iv & v are true, ii us false\n" + 
		                		"e) i & iii are true, ii, iv & v are false\"\""},
		                {"\"8. Non-functional system testing includes:\n" + 
		                		"a) testing to see where the system does not function properly\n" + 
		                		"b) testing quality attributes of the system including performance and usability\n" + 
		                		"c) testing a system feature using only the software required for that action\n" + 
		                		"d) testing a system feature using only the software required for that function\n" + 
		                		"e) testing for functions that should not exist\"\""},
		                {"\"9.  Which of the following is NOT part of configuration management:\n" + 
		                		"a) status accounting of configuration items\n" + 
		                		"b) auditing conformance to ISO9001\n" + 
		                		"c) identification of test versions\n" + 
		                		"d) record of changes to documentation over time\n" + 
		                		"e) controlled library access\"\""},
		                {"\"10. Which of the following is the main purpose of the integration strategy for\n" + 
		                		"integration testing in the small?\n" + 
		                		"a) to ensure that all of the small modules are tested adequately\n" + 
		                		"b) to ensure that the system interfaces to other systems and networks\n" + 
		                		"c) to specify which modules to combine when and how many at once\n" + 
		                		"d) to ensure that the integration testing can be performed by a small team\n" + 
		                		"e) to specify how the software should be divided into modules\"\""},
		                {"\"11.  What is the purpose of test completion criteria in a test plan:\n" + 
		                		"a) to know when a specific test has finished its execution\n" + 
		                		"b) to ensure that the test case specification is complete\n" + 
		                		"c) to set the criteria used in generating test inputs\n" + 
		                		"d) to know when test planning is complete\n" + 
		                		"e) to plan when to stop testing\"\""},
		                {"\"12. Consider the following statements\n" + 
		                		"i. an incident may be closed without being fixed\n" + 
		                		"ii. incidents may not be raised against documentation\n" + 
		                		"iii. the final stage of incident tracking is fixing\n" + 
		                		"iv. the incident record does not include information on test environments\n" + 
		                		"v. incidents should be raised when someone other than the author of the software\n" + 
		                		"www.istqb.guru\n" + 
		                		"performs the test\n" + 
		                		"a) ii and v are true, I, iii and iv are false\n" + 
		                		"b) i and v are true, ii, iii and iv are false\n" + 
		                		"c) i, iv and v are true, ii and iii are false\n" + 
		                		"d) i and ii are true, iii, iv and v are false\n" + 
		                		"e) i is true, ii, iii, iv and v are false\"\""},
		                {"\"13. Given the following code, which is true about the minimum number of test\n" + 
		                		"cases required for full statement and branch coverage:\n" + 
		                		"Read P\n" + 
		                		"Read Q\n" + 
		                		"IF P+Q > 100 THEN\n" + 
		                		"Print “Large”\n" + 
		                		"ENDIF\n" + 
		                		"If P > 50 THEN\n" + 
		                		"Print “P Large”\n" + 
		                		"ENDIF\n" + 
		                		"a) 1 test for statement coverage, 3 for branch coverage\n" + 
		                		"b) 1 test for statement coverage, 2 for branch coverage\n" + 
		                		"c) 1 test for statement coverage, 1 for branch coverage\n" + 
		                		"d) 2 tests for statement coverage, 3 for branch coverage\n" + 
		                		"e) 2 tests for statement coverage, 2 for branch coverage\"\""},
		                {"\"14. Given the following:\n" + 
		                		"Switch PC on\n" + 
		                		"Start “outlook”\n" + 
		                		"IF outlook appears THEN\n" + 
		                		"Send an email\n" + 
		                		"Close outlook\n" + 
		                		"a) 1 test for statement coverage, 1 for branch coverage\n" + 
		                		"b) 1 test for statement coverage, 2 for branch coverage\n" + 
		                		"c) 1 test for statement coverage. 3 for branch coverage\n" + 
		                		"d) 2 tests for statement coverage, 2 for branch coverage\n" + 
		                		"e) 2 tests for statement coverage, 3 for branch coverage\"\""},
		                {"\"15. Given the following code, which is true:\n" + 
		                		"IF A > B THEN\n" + 
		                		"C = A – B\n" + 
		                		"ELSE\n" + 
		                		"C = A + B\n" + 
		                		"ENDIF\n" + 
		                		"Read D\n" + 
		                		"IF C = D Then\n" + 
		                		"Print “Error”\n" + 
		                		"ENDIF\n" + 
		                		"www.istqb.guru\n" + 
		                		"a) 1 test for statement coverage, 3 for branch coverage\n" + 
		                		"b) 2 tests for statement coverage, 2 for branch coverage\n" + 
		                		"c) 2 tests for statement coverage. 3 for branch coverage\n" + 
		                		"d) 3 tests for statement coverage, 3 for branch coverage\n" + 
		                		"e) 3 tests for statement coverage, 2 for branch coverage\"\""},
		                {"\"16.  Consider the following:\n" + 
		                		"Pick up and read the newspaper\n" + 
		                		"Look at what is on television\n" + 
		                		"If there is a program that you are interested in watching then switch the the\n" + 
		                		"television on and watch the program\n" + 
		                		"Otherwise\n" + 
		                		"Continue reading the newspaper\n" + 
		                		"If there is a crossword in the newspaper then try and complete the crossword\n" + 
		                		"a) SC = 1 and DC = 1\n" + 
		                		"b) SC = 1 and DC = 2\n" + 
		                		"c) SC = 1 and DC = 3\n" + 
		                		"d) SC = 2 and DC = 2\n" + 
		                		"e) SC = 2 and DC = 3\"\""},
		                {"\"17. The place to start if you want a (new) test tool is:\n" + 
		                		"a) Attend a tool exhibition\n" + 
		                		"b) Invite a vendor to give a demo\n" + 
		                		"c) Analyse your needs and requirements\n" + 
		                		"d) Find out what your budget would be for the tool\n" + 
		                		"e) Search the internet\"\""},
		                {"\"18.  When a new testing tool is purchased, it should be used first by:\n" + 
		                		"a) A small team to establish the best way to use the tool\n" + 
		                		"b) Everyone who may eventually have some use for the tool\n" + 
		                		"c) The independent testing team\n" + 
		                		"d) The managers to see what projects it should be used in\n" + 
		                		"e) The vendor contractor to write the initial scripts\"\""},
		                {"\"19. What can static analysis NOT find?\n" + 
		                		"a) The use of a variable before it has been defined\n" + 
		                		"b) Unreachable (“dead”) code\n" + 
		                		"c) Whether the value stored in a variable is correct\n" + 
		                		"d) The re-definition of a variable before it has been used\n" + 
		                		"e) Array bound violations\"\""},
		                {"\"20. Which of the following is NOT a black box technique:\n" + 
		                		"a) Equivalence partitioning\n" + 
		                		"b) State transition testing\n" + 
		                		"c) LCSAJ\n" + 
		                		"d) Syntax testing\n" + 
		                		"www.istqb.guru\n" + 
		                		"e) Boundary value analysis\"\""},
		                {"\"21. Beta testing is:\n" + 
		                		"a) Performed by customers at their own site\n" + 
		                		"b) Performed by customers at their software developer’s site\n" + 
		                		"c) Performed by an independent test team\n" + 
		                		"d) Useful to test bespoke software\n" + 
		                		"e) Performed as early as possible in the lifecycle\"\""},
		                {"\"22. Given the following types of tool, which tools would typically be used by\n" + 
		                		"developers and which by an independent test team:\n" + 
		                		"i. static analysis\n" + 
		                		"ii. performance testing\n" + 
		                		"iii. test management\n" + 
		                		"iv. dynamic analysis\n" + 
		                		"v. test running\n" + 
		                		"vi. test data preparation\n" + 
		                		"a) developers would typically use i, iv and vi; test team ii, iii and v\n" + 
		                		"b) developers would typically use i and iv; test team ii, iii, v and vi\n" + 
		                		"c) developers would typically use i, ii, iii and iv; test team v and vi\n" + 
		                		"d) developers would typically use ii, iv and vi; test team I, ii and v\n" + 
		                		"e) developers would typically use i, iii, iv and v; test team ii and vi\"\""},
		                {"\"23. The main focus of acceptance testing is:\n" + 
		                		"a) finding faults in the system\n" + 
		                		"b) ensuring that the system is acceptable to all users\n" + 
		                		"c) testing the system with other systems\n" + 
		                		"d) testing for a business perspective\n" + 
		                		"e) testing by an independent test team\"\""},
		                {"\"24. Which of the following statements about the component testing standard is\n" + 
		                		"false:\n" + 
		                		"a) black box design techniques all have an associated measurement technique\n" + 
		                		"b) white box design techniques all have an associated measurement technique\n" + 
		                		"c) cyclomatic complexity is not a test measurement technique\n" + 
		                		"d) black box measurement techniques all have an associated test design technique\n" + 
		                		"e) white box measurement techniques all have an associated test design technique\"\""},
		                {"\"25.  Which of the following statements is NOT true:\n" + 
		                		"a) inspection is the most formal review process\n" + 
		                		"b) inspections should be led by a trained leader\n" + 
		                		"c) managers can perform inspections on management documents\n" + 
		                		"d) inspection is appropriate even when there are no written documents\n" + 
		                		"e) inspection compares documents with predecessor (source) documents\"\""},
		                {"\"26. A typical commercial test execution tool would be able to perform all of the\n" + 
		                		"following EXCEPT:\n" + 
		                		"a) generating expected outputs\n" + 
		                		"b) replaying inputs according to a programmed script\n" + 
		                		"c) comparison of expected outcomes with actual outcomes\n" + 
		                		"d) recording test inputs\n" + 
		                		"e) reading test values from a data file\"\""},
		                {"\"27. The difference between re-testing and regression testing is\n" + 
		                		"a) re-testing is running a test again; regression testing looks for unexpected side\n" + 
		                		"effects\n" + 
		                		"b) re-testing looks for unexpected side effects; regression testing is repeating\n" + 
		                		"those tests\n" + 
		                		"c) re-testing is done after faults are fixed; regression testing is done earlier\n" + 
		                		"d) re-testing uses different environments, regression testing uses the same\n" + 
		                		"environment\n" + 
		                		"e) re-testing is done by developers, regression testing is done by independent\n" + 
		                		"testers\"\""},
		                {"\"28. Expected results are:\n" + 
		                		"a) only important in system testing\n" + 
		                		"b) only used in component testing\n" + 
		                		"c) never specified in advance\n" + 
		                		"d) most useful when specified in advance\n" + 
		                		"e) derived from the code\"\""},
		                {"\"29. Test managers should not:\n" + 
		                		"a) report on deviations from the project plan\n" + 
		                		"b) sign the system off for release\n" + 
		                		"c) re-allocate resource to meet original plans\n" + 
		                		"d) raise incidents on faults that they have found\n" + 
		                		"e) provide information for risk analysis and quality improvement\"\""},
		                {"\"30. Unreachable code would best be found using:\n" + 
		                		"a) code reviews\n" + 
		                		"b) code inspections\n" + 
		                		"c) a coverage tool\n" + 
		                		"d) a test management tool\n" + 
		                		"e) a static analysis tool\"\""},
		                {"\"31. A tool that supports traceability, recording of incidents or scheduling of tests is\n" + 
		                		"called:\n" + 
		                		"a) a dynamic analysis tool\n" + 
		                		"b) a test execution tool\n" + 
		                		"c) a debugging tool\n" + 
		                		"d) a test management tool\n" + 
		                		"e) a configuration management tool\"n\""},
		                {"\"32. What information need not be included in a test incident report:\n" + 
		                		"a) how to fix the fault\n" + 
		                		"b) how to reproduce the fault\n" + 
		                		"c) test environment details\n" + 
		                		"d) severity, priority\n" + 
		                		"e) the actual and expected outcomes\"\""},
		                {"\"33. Which expression best matches the following characteristics or review\n" + 
		                		"processes:\n" + 
		                		"1. led by author\n" + 
		                		"2. undocumented\n" + 
		                		"3. no management participation\n" + 
		                		"4. led by a trained moderator or leader\n" + 
		                		"5. uses entry exit criteria\n" + 
		                		"s) inspection\n" + 
		                		"t) peer review\n" + 
		                		"u) informal review\n" + 
		                		"v) walkthrough\n" + 
		                		"a) s = 4, t = 3, u = 2 and 5, v = 1\n" + 
		                		"b) s = 4 and 5, t = 3, u = 2, v = 1\n" + 
		                		"c) s = 1 and 5, t = 3, u = 2, v = 4\n" + 
		                		"d) s = 5, t = 4, u = 3, v = 1 and 2\n" + 
		                		"e) s = 4 and 5, t = 1, u = 2, v = 3\"\""},
		                {"\"34. Which of the following is NOT part of system testing:\n" + 
		                		"a) business process-based testing\n" + 
		                		"b) performance, load and stress testing\n" + 
		                		"c) requirements-based testing\n" + 
		                		"d) usability testing\n" + 
		                		"e) top-down integration testing\"\""},
		                {"\"35. What statement about expected outcomes is FALSE:\n" + 
		                		"a) expected outcomes are defined by the software’s behaviour\n" + 
		                		"b) expected outcomes are derived from a specification, not from the code\n" + 
		                		"c) expected outcomes include outputs to a screen and changes to files and\n" + 
		                		"databases\n" + 
		                		"d) expected outcomes should be predicted before a test is run\n" + 
		                		"e) expected outcomes may include timing constraints such as response times\"\""},
		                {"\"36. The standard that gives definitions of testing terms is:\n" + 
		                		"a) ISO/IEC 12207\n" + 
		                		"b) BS7925-1\n" + 
		                		"c) BS7925-2\n" + 
		                		"d) ANSI/IEEE 829\n" + 
		                		"e) ANSI/IEEE 729\"\""},
		                {"\"37. The cost of fixing a fault:\n" + 
		                		"a) Is not important\n" + 
		                		"b) Increases as we move the product towards live use\n" + 
		                		"c) Decreases as we move the product towards live use\n" + 
		                		"d) Is more expensive if found in requirements than functional design\n" + 
		                		"e) Can never be determined\"\""},
		                {"\"38. Which of the following is NOT included in the Test Plan document of the Test\n" + 
		                		"Documentation Standard:\n" + 
		                		"a) Test items (i.e. software versions)\n" + 
		                		"b) What is not to be tested\n" + 
		                		"c) Test environments\n" + 
		                		"d) Quality plans\n" + 
		                		"e) Schedules and deadlines\"\""},
		                {"\"39. Could reviews or inspections be considered part of testing:\n" + 
		                		"a) No, because they apply to development documentation\n" + 
		                		"b) No, because they are normally applied before testing\n" + 
		                		"c) No, because they do not apply to the test documentation\n" + 
		                		"d) Yes, because both help detect faults and improve quality\n" + 
		                		"e) Yes, because testing includes all non-constructive activities\"\""},
		                {"\"40. Which of the following is not part of performance testing:\n" + 
		                		"a) Measuring response time\n" + 
		                		"b) Measuring transaction rates\n" + 
		                		"c) Recovery testing\n" + 
		                		"d) Simulating many users\n" + 
		                		"e) Generating many transactions\"\""},
		                {"\"41. Error guessing is best used\n" + 
		                		"a) As the first approach to deriving test cases\n" + 
		                		"b) After more formal techniques have been applied\n" + 
		                		"c) By inexperienced testers\n" + 
		                		"d) After the system has gone live\n" + 
		                		"e) Only by end users\"\""},
		                
		        };

		        int rowNum = 0;
		        System.out.println("Creaando excel, espere...");

		        for (Object[] sampleExam1 : sampleExam) {
		            Row row = sheet.createRow(rowNum++);
		            int colNum = 0;
		            for (Object field : sampleExam1) {
		                Cell cell = row.createCell(colNum++);
		                if (field instanceof String) {
		                    cell.setCellValue((String) field);
		                } else if (field instanceof Integer) {
		                    cell.setCellValue((Integer) field);
		                }
		            }
		        }

		        try {
		            FileOutputStream outputStream = new FileOutputStream(Examen_test);
		           workbook.write(outputStream);
		           // workbook.close();
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Hecho!");
		    }
		}
