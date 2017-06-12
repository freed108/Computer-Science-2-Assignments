public class File extends Document
{
        private String m_pathname;
	private String pathname;

        public void setFile(String pathname)
        {
                this.m_pathname = pathname;
        }

        public String getpathname()
        {
                return m_pathname;
        }

        public void setPathname(String pathname)
        {
                pathname = "Documents > Assignments";
        }

        public void setBody2()
        {
                setText(pathname);
        }
}
