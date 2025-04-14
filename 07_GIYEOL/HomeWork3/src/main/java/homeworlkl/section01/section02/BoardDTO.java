package homeworlkl.section01.section02;

import javax.xml.crypto.Data;

public class BoardDTO {
    private int boardNo;
    private String boardtitle;
    private String boardwirter;
    private Data boarddata;
    private String boardContent;
    private int readCount;

    public BoardDTO() {
    }

    public BoardDTO(int boardNo,String boardtitle, String boardwirter,
                    Data boarddata,String boardContent
                    ,int readCount) {
        this.boardNo = boardNo;
        this.boardtitle = boardtitle;
        this.boardwirter = boardwirter;
        this.boarddata = boarddata;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public Data getBoarddata() {
        return boarddata;
    }

    public void setBoarddata(Data boarddata) {
        this.boarddata = boarddata;
    }

    public String getBoardwirter() {
        return boardwirter;
    }

    public void setBoardwirter(String boardwirter) {
        this.boardwirter = boardwirter;
    }

    public String getBoardtitle() {
        return boardtitle;
    }

    public void setBoardtitle(String boardtitle) {
        this.boardtitle = boardtitle;
    }

    @Override
    public String toString() {
        return "[" +
                "boardNo=" + boardNo +
                ", boardtitle='" + boardtitle + '\'' +
                ", boardwirter='" + boardwirter + '\'' +
                ", boarddata=" + boarddata +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                ']';
    }
}
