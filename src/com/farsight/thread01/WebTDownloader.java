package com.farsight.thread01;

public class WebTDownloader extends Thread {
	private String url; // 远程路径 图片地址
	private String name; // 存储名字 图片名字

	public WebTDownloader(String url, String name) {
		this.url = url;
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		WebTDownloader td1 =new WebTDownloader("http://upload.news.cecb2b.com/2014/0511/1399775432250.jpg","c:/phone.jpg");
		WebTDownloader td2 =new WebTDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","c:/spl.jpg");
		WebTDownloader td3 =new WebTDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","c:/success.jpg");
		//启动三个线程
		td1.start();//就绪
		td2.start();//就绪
		td3.start();//就绪
	}
}
