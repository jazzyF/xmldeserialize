# xmldeserialize

Issue is this:

<ns1:Performance xmlns:ns0="urn:my:com:perf" xmlns:ns1="urn:my:com:perf:inv:Performance" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:wstxns1="xsi" wstxns1:schemaLocation="urn:my:com:perf:inv:Performance Performance.xsd">


I need it to be like below:

<ns1:Performance xmlns:ns0="urn:my:com:perf" xmlns:ns1="urn:my:com:perf:inv:Performance" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="urn:my:com:perf:inv:Performance Performance.xsd">

