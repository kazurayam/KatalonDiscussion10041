import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

TestData data = findTestData('Book1 (1)')

for (int row = 1; row <= data.getRowNumbers(); row++) {
	StringBuilder sb = new StringBuilder()
	for (int col = 1; col <= 3; col++) {
		if (col > 1) sb.append(',')
		sb.append(data.getValue(col, row))
	}
	WebUI.comment("${row}: ${sb.toString()}")	
}

