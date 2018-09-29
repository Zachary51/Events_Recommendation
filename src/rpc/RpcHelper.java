package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 
 * @author zacharywong
 * This class is used to handle all rpc parsing codes. It can helps avoid duplicate codes
 */
public class RpcHelper {
	// Write a JSONArray to http response
	public static void writeJsonArray(HttpServletResponse response, JSONArray array) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin", "*");
		out.print(array);
		out.close();
	}
	
	// Write a JSONObejct to http response
	public static void writeJsonObject(HttpServletResponse response, JSONObject object) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin", "*");
		out.print(object);
		out.close();
	}
}
