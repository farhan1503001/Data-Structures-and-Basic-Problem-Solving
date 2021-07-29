import java.util.Stack;
class Document {
	String content;
	String fontname;
	int fontsize;
	public Document()
	{
		this.content="";
		this.fontname="";
		this.fontsize=10;
	}
	public Document(String content,String fontname,int fontsize)
	{
		this.content=content;
		this.fontname=fontname;
		this.fontsize=fontsize;
	}

}

public class Editor {
	 Document document;
	 Stack<Document>holder;
	 public Editor()
	 {
		 this.document=new Document();
		 this.holder=new Stack<>();
	 }
	public void setDocumentcontent(String content)
	{
		holder.add(new Document(document.content,document.fontname,document.fontsize));
		document.content=content;
	}
	public void setDocumentFontName(String fontname)
	{
		holder.add(new Document());
		document.fontname=fontname;
	}
	public void setDocumentFontsize(int fontsize) {
		holder.add(this.document);
		System.out.println(holder.peek().fontsize);
		document.fontsize=fontsize;
	}
	public void undo()
	{
		Document prev=holder.pop();
		this.document.content=prev.content;
		this.document.fontname=prev.fontname;
		this.document.fontsize=prev.fontsize;
	}
	public void Print()
	{
		System.out.println(this.document.content+"   "+this.document.fontname+"  "+this.document.fontsize);
	}
	public static void main(String[] args)
	{
		Editor edit=new Editor();
		edit.setDocumentcontent("Hello");
		System.out.println(edit.document.content);
		edit.setDocumentFontName("Tahoma");
		System.out.println(edit.document.fontname);
		edit.Print();
		//edit.undo();
		edit.setDocumentFontsize(11);
		edit.setDocumentcontent("Print");
		edit.Print();
		
		edit.undo();
		edit.Print();
	}
}
