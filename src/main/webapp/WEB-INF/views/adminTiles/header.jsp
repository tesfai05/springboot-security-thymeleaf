<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="<spring:url value="/" />">E-Mart</a>
  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">

      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/admin/products/list" />">Products</a></li>
      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/admin/create" />">Create Admin</a></li>
      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/admin/admins" />">All Admin</a></li>
      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/admin/products" />">Add New Product</a></li>

    </ul>
    <ul class="navbar-nav" style="float: right;">
      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/admin/orders" />">Orders</a></li>
      <li class="nav-item"><a class="nav-link"
        href="<spring:url value="/logout" />">Logout</a></li>
    </ul>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <form method="get" action="#">
      <div style="margin-top: 1em;" class="row">
        <div class="col-md-12">
          <div class="input-group">
            <input type="text" class="form-control mr-sm-2" id="txt"
              name="txt" placeholder="search" />
            <div class="input-group-append">
              <button id="btnSubmit" type="submit"
                class="btn btn-secondary my-2 my-sm-0">Search</button>
            </div>
          </div>
        </div>
      </div>
    </form>

  </div>
</nav>