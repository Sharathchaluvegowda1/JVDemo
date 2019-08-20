<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output omit-xml-declaration="yes" indent="no"/>
  <xsl:strip-space elements="*"/>

  <xsl:variable name="vLowercase" select="'abcdefghijklmnopqrstuvwxyz'"/>
  <xsl:variable name="vUppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>

  <xsl:template match="*">
    <xsl:element
      name="{concat(translate(substring(local-name(), 1, 1),
                              $vLowercase,
                              $vUppercase),
                    substring(local-name(), 2))}"
    >
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>
  

</xsl:stylesheet>