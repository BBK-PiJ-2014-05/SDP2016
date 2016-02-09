package composite;

/**
 * Created by geoff_000 on 09/02/2016.
 */
public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;


    public HtmlElement(String tagName){
        this.tagName = tagName;
    }


    public String getTagName(){
        return tagName;
    }

    public void setStartTag(String tag){
        startTag = tag;
    }
    public void setEndTag(String tag){
        endTag = tag;
    }

    public void generateHtml(){
        System.out.print(startTag);
        System.out.print(tagBody);
        System.out.println(endTag);

    }

    public void setTagBody(String tagBody){
        this.tagBody = tagBody;
    }
}
