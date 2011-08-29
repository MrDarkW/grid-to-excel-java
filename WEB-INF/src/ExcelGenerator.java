
import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.http.*;

import com.dhtmlx.xml2excel.ExcelWriter;


@SuppressWarnings("serial")
public class ExcelGenerator extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String xml = req.getParameter("grid_xml");
		xml = URLDecoder.decode(xml, "UTF-8");
		(new ExcelWriter()).generate(xml, resp);
	}

}