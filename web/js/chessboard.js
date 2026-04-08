var tbl="";
tbl+="<table border='1' cellspaceing='10px' cellpadding='10px'>";
    for(i=1;i<=8;i++)
    {
        if(i%2==0)
        {
        tbl+="<tr>";
        for(j=1;j<=8;j++)
        {
            if(j%2==0)
            {
            tbl+="<td bgcolor='teal'></td>"
            }
            else
            {
                tbl+="<td bgcolor='orangered'></td>"
            }
        }
      }
    else
    {
        tbl+="<tr>";
        for(j=1;j<=8;j++)
        {
            if(j%2==0)
            {
            tbl+="<td bgcolor='orangered'></td>"
            }
            else
            {
                tbl+="<td bgcolor='teal'></td>"
            }
        }
    }
        tbl+="</tr>";
    }
tbl+="</table>";
document.write(tbl);
