package DevelopModal;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter {
	public static void main(String[] args) {
		//String msg = "金坷垃速度进设计<script>, 敏感, 89";
		FilterImpl f = new FilterImpl();
		//f.setMsg(msg);
		FilterChain fc = new FilterChain();
		Request req = new Request();
		req.setRequeststr("resquest");
		f.setReq(req);
		Response res = new Response();
		res.setResponsetstr("response");
		f.setRes(res);
		f.setFc(fc);
		fc.addFilter(new HTMLFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new MinGanCiFilter());
		//fc.addFilter(fc2);
		//fc.doFilter(req,res,fc);
		fc2.addFilter(fc);
		fc2.doFilter(req, res,fc);
		System.out.println(req.getRequeststr()+"\n"+res.getResponsetstr());
		

	}

}
class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<Filter>();
	int index =0;
	public FilterChain addFilter(Filter f){
		this.filters.add(f);
		return this;
	}
	public FilterChain removeFilter(Filter f){
		this.filters.remove(f);
		return this;
	}
	@Override
	public void doFilter(Request req, Response res, FilterChain chain) {
		if(index == filters.size()) return ;
		Filter f = filters.get(index);
		index++;
		f.doFilter(req, res, chain);
		
	}
}
interface Filter{
	public void doFilter(Request req, Response res, FilterChain chain);
}

class HTMLFilter implements Filter{
	@Override
	public void doFilter(Request req, Response res,  FilterChain chain) {
		String req1  = req.getRequeststr();
		req1 += "====>HTMLFilter===>";
		req.setRequeststr(req1);
		
		chain.doFilter(req, res, chain);
		
		String res1  = res.getResponsetstr();
		res1 += "====>HTMLFilter===>";
		res.setResponsetstr(res1);
	}	
}
class MinGanCiFilter implements Filter{
	@Override
	public void doFilter(Request req, Response res, FilterChain chain) {
		 String req1 = req.getRequeststr();
		 req1 += "====>MinGanCiFilter===>";
		 req.setRequeststr(req1);
		 
		 chain.doFilter(req, res, chain);
		 
		 String res1 = res.getResponsetstr();
		 res1 += "====>MinGanCiFilter===>";
		 res.setResponsetstr(res1);
		
	}	
}

class FilterImpl{
	private String msg;
	
	FilterChain fc;
	Response res;
	Request req;
	
	public Response getRes() {
		return res;
	}
	public void setRes(Response res) {
		this.res = res;
	}
	public Request getReq() {
		return req;
	}
	public void setReq(Request req) {
		this.req = req;
	}
	public FilterChain getFc() {
		return fc;
	}
	public void setFc(FilterChain fc) {
		this.fc = fc;
	}
	//Filter[] filters = {new HTMLFilter(),new MinGanCiFilter()};
	public String Filter(){
		String rs = msg;
		fc.doFilter(req,res,fc);
		return rs;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

class Request{
	String requeststr;

	public String getRequeststr() {
		return requeststr;
	}

	public void setRequeststr(String requeststr) {
		this.requeststr = requeststr;
	}
	
}

class Response{
	String responsetstr;

	public String getResponsetstr() {
		return responsetstr;
	}

	public void setResponsetstr(String responsetstr) {
		this.responsetstr = responsetstr;
	}
	
}