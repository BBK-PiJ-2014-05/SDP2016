package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geoff_000 on 09/02/2016.
 */
public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;
    private List<HtmlTag> children;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        children = new ArrayList<HtmlTag>();
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

    public void setTagBody(String tag){
        tagBody = tag;
    }

    public void addChildTag(HtmlTag tag){
        children.add(tag);
    }

    public List<HtmlTag> getChildren() {
        return children;
    }

    public void generateHtml(){
        System.out.println(startTag);
        //System.out.println(tagBody);
        for (HtmlTag tag : children){
            tag.generateHtml();
        }
        System.out.println(endTag);

    }


}
